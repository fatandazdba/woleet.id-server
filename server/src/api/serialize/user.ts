import { serializeIdentity } from './identity';

export function serialiseUser(user: InternalUserObject): ApiUserObject {
  const dates = {
    createdAt: +user.createdAt,
    updatedAt: +user.updatedAt,
    deletedAt: +user.deletedAt,
    lastLogin: +user.lastLogin
  };

  const identity = serializeIdentity(user);

  const { id, role, status, email, username, defaultKeyId } = user;

  return Object.assign({ id, role, username, status, email, defaultKeyId, identity }, dates);
}
