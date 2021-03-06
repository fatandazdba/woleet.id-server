export function serializeServerConfig(config: InternalServerConfigObject): ApiServerConfig {
  const {
    fallbackOnDefaultKey,
    defaultKeyId,
    identityURL,
    publicInfo,
    allowUserToSign,
    useOpenIDConnect,
    openIDConnectURL,
    openIDConnectClientId,
    openIDConnectClientSecret,
    openIDConnectClientRedirectURL,
    enableOIDCP,
    OIDCPInterfaceURL,
    OIDCPProviderURL,
    OIDCPIssuerURL,
    OIDCPClients,
    keyExpirationOffset,
    useSMTP,
    SMTPConfig,
    ServerClientURL
  } = config;

  return {
    fallbackOnDefaultKey,
    defaultKeyId,
    identityURL,
    publicInfo,
    allowUserToSign,
    useOpenIDConnect,
    openIDConnectURL,
    openIDConnectClientId,
    openIDConnectClientSecret,
    openIDConnectClientRedirectURL,
    enableOIDCP,
    OIDCPInterfaceURL,
    OIDCPProviderURL,
    OIDCPIssuerURL,
    OIDCPClients,
    keyExpirationOffset,
    useSMTP,
    SMTPConfig,
    ServerClientURL
  };
}
