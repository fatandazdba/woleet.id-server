import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { serverURL } from './config';


@Injectable()
export class AuthService {

  private user: ApiUserDTOObject = null;

  constructor(private http: HttpClient, private router: Router) {

    const user = localStorage.getItem('user');

    if (user) {
      try {
        this.user = JSON.parse(user);
        console.log('got', this.user, 'from local storage');
      } catch { }
    }
  }

  async logout() {
    this.user = null;
    localStorage.removeItem('user');
    await this.http.get(`${serverURL}/logout/`).toPromise().catch(() => null);
    this.router.navigate(['login']);
  }

  async login(user: BasicAuthObject, redirect = true) {
    console.log('login', user)

    const headers = (new HttpHeaders()).append("Authorization", "Basic " + btoa(`${user.username}:${user.password}`));
    const auth: AuthResponseObject = await this.http
      .get<AuthResponseObject>(`${serverURL}/login/`, { headers })
      .toPromise()
      .catch(() => null);

    if (!auth)
      return false;

    console.log('Logged', auth);

    this.user = auth.user;
    localStorage.setItem('user', JSON.stringify(auth.user));

    if (redirect)
      this.router.navigate(['main']);
  }

  getUser(): ApiUserDTOObject {
    return this.user;
  }

  isAuthenticated(): boolean {
    return !!this.user;
  }

  isAdmin(): boolean {
    return this.isAuthenticated() && this.user.role == 'admin';
  }

}