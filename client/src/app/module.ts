import { NgModule, APP_INITIALIZER } from '@angular/core';
import { FlexLayoutModule } from '@angular/flex-layout';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './routing';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import {
  MatToolbarModule, MatButtonModule, MatSidenavModule,
  MatIconModule, MatListModule, MatInputModule, MatCardModule,
  MatSelectModule,
  MatTooltipModule,
  MatRippleModule,
  MatCheckboxModule,
  MatDatepickerModule,
  MatNativeDateModule,
  MAT_DIALOG_DEFAULT_OPTIONS,
  MatDialogModule
} from '@angular/material';

import { LayoutModule } from '@angular/cdk/layout';

import { AppComponent } from '@parts/main';
import { NavBarComponent } from '@parts/nav-bar';
import { UserFormComponent } from '@parts/user.form';
import { UserCardComponent } from '@parts/user.card';
import { KeyCardComponent } from '@parts/key.card';
import { ConfigFallbackKeyComponent } from '@parts/config.fallback-key';
import { ConfigIdentityUrlComponent } from '@parts/config.identity-url';
import { ConfigWebClientUrlComponent } from '@parts/config.server-client-url';
import { APITokenCreateCardComponent } from '@parts/api-token.card.create';
import { APITokenCardComponent } from '@parts/api-token.card';
import { KeyCreateCardComponent } from '@parts/key.card.create';
import { IntlTelInputComponent } from '@parts/intl-tel-input';
import { ConfigLogoUrlComponent } from '@parts/config.logo-url';
import { ConfigHTMLFrameUrlComponent } from '@parts/config.html-frame';
import { LogoComponent } from '@parts/logo';
import { HtmlFrameComponent } from '@parts/html-frame';

import { LoginPageComponent } from '@pages/login';
import { SetupPageComponent } from '@pages/setup';
import { APITokensPageComponent } from '@pages/api-tokens';
import { UserPageComponent } from '@pages/user';
import { AboutPageComponent } from '@pages/about';
import { ErrorPageComponent } from '@pages/error';
import { SettingsPageComponent } from '@pages/settings';
import { UserEditPageComponent } from '@pages/user.edit';
import { UserListPageComponent } from '@pages/user.list';
import { UserDetailPageComponent } from '@pages/user.detail';
import { ResetPasswordPageComponent } from '@pages/reset-password';
import { DialogResetPasswordComponent } from '@parts/dialog-reset-password';
import { DialogMailResetComponent } from '@parts/dialog-mail-reset';

// Services
import { AdminGuardService, UserGuardService, AnonymousGuardService, ErrorGuardService, NoErrorGuardService } from '@guards/auth';

import { KeyService } from '@services/key';
import { UserService } from '@services/user';
import { InfoService } from '@services/info';
import { APITokenService } from '@services/api-token';
import { PageDataService } from '@services/page-data';
import { ServerConfigService } from '@services/server-config';

import { AllowCredentialsInterceptorService } from '@interceptors/allow-credentials';
import { NetworkErrorInterceptorService } from '@interceptors/network-error';
import { UnauthorizedInterceptorService } from '@interceptors/unauthorized';
import { ForbiddenInterceptorService } from '@interceptors/forbidden';

import { NeedConfigGuardService } from '@services/guards/config';
import { ConfigService } from '@services/config';
import { StopPropagationDirective } from '@directives/stop-propagation';
import { StopRipplePropagationDirective } from '@directives/stop-ripple-propagation';
import { OAuthRedirectComponent } from '@pages/oauth-redirect';
import { OIDCProviderInteractionComponent } from '@pages/oidcp-interaction';
import { AppConfigService } from '@services/boot';
import { Http, HttpModule } from '@angular/http';
import { ConfigOpenIDComponent } from '@components/parts/config.openid';
import { ConfigOIDCPComponent } from '@components/parts/config.oidcp';
import { ConfigOIDCPClientComponent } from '@components/parts/config.oidcp-client';
import { ConfigSMTPComponent } from '@components/parts/config.smtp';
import { LocalStorageService } from '@services/local-storage';
import { ConfigKeyExpirationComponent } from '@components/parts/config.key-expiration';

export function startupServiceFactory(startupService: AppConfigService): Function {
  return () => startupService.load();
}

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    LoginPageComponent,
    SetupPageComponent,
    SettingsPageComponent,
    APITokensPageComponent,
    UserPageComponent,
    UserListPageComponent,
    UserFormComponent,
    UserEditPageComponent,
    UserDetailPageComponent,
    AboutPageComponent,
    ConfigFallbackKeyComponent,
    ConfigIdentityUrlComponent,
    ConfigWebClientUrlComponent,
    ConfigOpenIDComponent,
    ConfigOIDCPComponent,
    ConfigOIDCPClientComponent,
    ConfigKeyExpirationComponent,
    UserCardComponent,
    KeyCardComponent,
    APITokenCardComponent,
    APITokenCreateCardComponent,
    KeyCreateCardComponent,
    StopPropagationDirective,
    StopRipplePropagationDirective,
    ErrorPageComponent,
    OAuthRedirectComponent,
    OIDCProviderInteractionComponent,
    IntlTelInputComponent,
    ConfigLogoUrlComponent,
    ConfigHTMLFrameUrlComponent,
    LogoComponent,
    HtmlFrameComponent,
    ResetPasswordPageComponent,
    ConfigSMTPComponent,
    DialogResetPasswordComponent,
    DialogMailResetComponent
  ],
  entryComponents: [
    DialogResetPasswordComponent,
    DialogMailResetComponent
  ],
  imports: [
    // angular
    BrowserAnimationsModule,
    BrowserModule,

    // forms
    FormsModule,

    // material
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,

    // http
    HttpClientModule,
    HttpModule,

    // nav
    LayoutModule,
    MatRippleModule,
    FlexLayoutModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    MatInputModule,
    MatSelectModule,
    MatCardModule,
    MatTooltipModule,
    MatCheckboxModule,
    MatDatepickerModule,
    MatNativeDateModule,

    // app
    AppRoutingModule,

    // dialog
    MatDialogModule
  ],
  providers: [
    AppConfigService,
    {
      // Provider for APP_INITIALIZER
      provide: APP_INITIALIZER,
      useFactory: startupServiceFactory,
      deps: [AppConfigService, Http],
      multi: true
    },
    {provide: MAT_DIALOG_DEFAULT_OPTIONS, useValue: {hasBackdrop: false}},
    AdminGuardService, UserGuardService, AnonymousGuardService, ErrorGuardService, NoErrorGuardService,
    NeedConfigGuardService, KeyService, UserService, InfoService, ConfigService, APITokenService,
    PageDataService, ServerConfigService, UnauthorizedInterceptorService, ForbiddenInterceptorService,
    NetworkErrorInterceptorService, AllowCredentialsInterceptorService, LocalStorageService
  ],
  bootstrap: [AppComponent]
})

export class AppModule { }
