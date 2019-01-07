export function serializeKey(key: InternalKeyObject): ApiKeyObject {
  const dates = {
    expiration: +key.expiration || null,
    createdAt: +key.createdAt || null,
    updatedAt: +key.updatedAt || null,
    deletedAt: +key.deletedAt || null,
    lastUsed: +key.lastUsed || null
  };

  const { id, name, status, type, publicKey } = key;

  const expired = key.expiration ? (+key.expiration < Date.now()) : undefined;

  return Object.assign({ id, name, status, type, pubKey: publicKey, expired }, dates);
}
