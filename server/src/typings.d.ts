import { RequestHandler, Request, Response, NextFunction } from "express";
import { Instance } from "sequelize";
import { SessionStore } from "./session";

export interface Dictionary<T> {
  [Key: string]: T;
}

export interface AsyncRequestHandler extends RequestHandler {
  (req: Request, res: Response, next: NextFunction): Promise<any>;
}

type UserTypeEnum = 'user' | 'admin';
type UserStatusEnum = 'active' | 'blocked' | 'removed';

export interface UserObject {
  username: string,
  firstName: string,
  lastName: string
}

export interface InternalUserObject extends UserObject {
  id: string,
  lastLogin: string,
  updatedAt: string,
  createdAt: string,

  type: UserTypeEnum,
  status: UserStatusEnum,
  email: string | null,
  password_hash: string,
  password_salt: string,
  password_itrs: number
}

export interface SequelizeUserObject extends Instance<InternalUserObject> { }

export interface ApiUserObject extends UserObject {
  id: string,
  createdAt: number,
  updatedAt: number,
  lastLogin: number,

  type: UserTypeEnum,
  status: UserStatusEnum,
  email: string | null,
}

export interface ApiFullUserObject extends UserObject {
  type: UserTypeEnum,
  status: UserStatusEnum,
  email: string,
  password: string
}

export interface ApiPostUserObject extends UserObject {
  type?: UserTypeEnum,
  status?: UserStatusEnum,
  email?: string,
  password: string
}

export interface ApiPutUserObject extends UserObject {
  type?: UserTypeEnum,
  status?: UserStatusEnum,
  email?: string,
  password?: string
}

export interface Session {
  id: string,
  user: SequelizeUserObject
}

declare module 'koa' {
  interface Context {
    session: Session | null;
  }
}