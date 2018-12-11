// The content of the specified environment will overwrite this one during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.

const { protocol, hostname } = window.location;

const port = 3000;

export const environment = {
  version: '0.3.0',
  production: false,
  serverURL: `${protocol}//${hostname}:${port}`
};
