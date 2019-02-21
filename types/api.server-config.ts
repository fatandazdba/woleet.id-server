interface ServerConfig { }

type uri = string;

interface ApiOIDCPClient {
  token_endpoint_auth_method: string,
  client_id: string,
  client_secret: string,
  redirect_uris: uri[],
}

interface ApiServerConfig {
  identityURL: string;
  defaultKeyId: string;
  fallbackOnDefaultKey: boolean;
  allowUserToSign: boolean;

  // Open ID Connect config
  useOpenIDConnect: boolean;
  openIDConnectURL: string | null;
  openIDConnectClientId: string | null;
  openIDConnectClientSecret: string | null;
  openIDConnectClientRedirectURL: string | null;

  // Open ID Connect Provider config
  OIDCPInterfaceURL: string | null;
  OIDCPProviderURL: string | null;
  OIDCPIssuerURL: string | null;
  OIDCPClients: ApiOIDCPClient[] | null;
  enableOIDCP: boolean;
  keyExpirationOffset?: string;

  // SMTP config
  useSMTP: boolean;
  SMTPHost: string | null;
  SMTPPort: string | null;
  SMTPUser: string | null;
  SMTPSecret: string | null;
  SMTPService: string | null;
}

interface ApiServerConfigUpdate {
  identityURL?: string;
  defaultKeyId?: string;
  fallbackOnDefaultKey?: boolean;
  allowUserToSign?: boolean;

  // Open ID Connect config
  useOpenIDConnect?: boolean;
  openIDConnectURL?: string;
  openIDConnectClientId?: string;
  openIDConnectClientSecret?: string;
  openIDConnectClientRedirectURL?: string;

  // Open ID Connect Provider config
  OIDCPInterfaceURL?: string;
  OIDCPProviderURL?: string;
  OIDCPIssuerURL?: string;
  OIDCPClients?: ApiOIDCPClient[];
  enableOIDCP?: boolean;
  keyExpirationOffset?: string;

  // SMTP config
  useSMTP?: boolean;
  SMTPHost?: string;
  SMTPPort?: string;
  SMTPUser?: string;
  SMTPSecret?: string;
  SMTPService?: string;
}
