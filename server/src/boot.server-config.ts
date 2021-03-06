import { loadServerConfig, setServerConfig } from './controllers/server-config';
import * as log from 'loglevel';

import * as Debug from 'debug';
import { Key } from './database';
import { randomBytes } from 'crypto';
import { createUser } from './controllers/user';
import { exit } from './exit';
import { serverConfig } from './config';
import { signMessage } from './controllers/sign';

const debug = Debug('id:boot.server-config');

export async function initServerConfig() {
  const config = await loadServerConfig();
  if (config) {
    log.info(`Server configuration successfully restored`);
    debug(JSON.stringify(config, null, 2));

    const key = await Key.getAny();

    if (!key) {
      log.warn('Not any key in database, cannot check secret restoration');
      return;
    }

    log.info('Checking that the secret is correct...');
    try {
      await signMessage(key, randomBytes(32).toString('hex'));
    } catch (err) {
      log.warn(err.message);
      throw new Error('Secret is not the same that the previously set one');
    }
    if (!config.publicInfo) {
      log.warn('the public information is set as an empty object.');
      config.publicInfo = {};
    }

  } else {
    log.warn('No configuration found in database, creating a new one along with a default admin user...');
    log.debug('Creating an admin user');
    let admin;
    try {
      admin = await createUser({
        password: 'pass',
        role: 'admin',
        username: 'admin',
        identity: { commonName: 'Admin' }
      });
    } catch (err) {
      return exit(`Failed to create user "admin": ${err.message}`, err);
    }

    log.info(`Created user "admin" with id ${admin.id}`);

    const conf = await setServerConfig(Object.assign({}, serverConfig.default, { defaultKeyId: admin.defaultKeyId }));
    log.info(`Created new server configuration with defaults: ${JSON.stringify(conf, null, 2)}`);
  }
}
