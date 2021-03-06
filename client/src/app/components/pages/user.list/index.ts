import { Component, OnInit } from '@angular/core';
import { UserService } from '@services/user';
import { TrackById } from '@components/util';

@Component({
  templateUrl: './index.html',
  styleUrls: ['./style.scss']
})
export class UserListPageComponent extends TrackById implements OnInit {

  formOpened = false;

  users$: Promise<ApiUserObject[]>;

  constructor(private service: UserService) {
    super();
  }

  ngOnInit() {
    this.refreshUserList();
  }

  refreshUserList() {
    this.users$ = this.service.getAll();
  }

}
