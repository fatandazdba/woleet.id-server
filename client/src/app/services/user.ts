import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const serverURL = 'http://localhost:3000'

@Injectable()
export class UserService {

  constructor(private http: HttpClient) { }

  getById(userId: string): Promise<ApiUserObject> {
    return this.http.get<ApiUserObject>(`${serverURL}/user/${userId}/`).toPromise()
  }

  async getAll(): Promise<ApiUserObject[]> {
    return this.http.get<ApiUserObject[]>(`${serverURL}/user/list`).toPromise()
  }

  async create(user: ApiPostUserObject): Promise<ApiUserObject> {
    return this.http.post<ApiUserObject>(`${serverURL}/user/`, user).toPromise()
  }

  async edit(userId: string, userAttrs: ApiPutUserObject): Promise<ApiUserObject> {
    return this.http.put<ApiUserObject>(`${serverURL}/user/${userId}/`, userAttrs).toPromise()
  }

  async delete(keyId: string): Promise<any> {
    return this.http.delete(`${serverURL}/user/${keyId}`).toPromise()
  }

}
