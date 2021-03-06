import { serializeIdentity } from './identity';

export function serializeUserDTO(user: InternalUserObject): ApiUserDTOObject {
  return {
    email: user.email,
    username: user.username,
    role: user.role,
    countryCallingCode: user.countryCallingCode,
    phone: user.phone,
    identity: serializeIdentity(user, true)
  };
}
