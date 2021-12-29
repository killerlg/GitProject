import {Component, OnInit, ViewEncapsulation} from '@angular/core';
import {User} from '../../models/user';
import {Message} from '../../models/message';
import {Group} from '../../models/group';
import {ServiceService} from '../../services/service.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class DisplayComponent implements OnInit {
  users: User[];
  // messages: Message[];
  groups: Group[];
  currentUser: User;
  id: number;

  constructor(private service: ServiceService,
              private router: Router,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe(param => {
      this.id = +param.get('id');
      this.currentUser = this.service.getUserById(this.id);
      this.service.currentUserEmit.next(this.id);
      this.groups = this.service.getAllGroupById(this.id);
      if (this.groups.length === 0) {
        this.router.navigate(['./allgroup'], {relativeTo: this.activatedRoute});
      } else {
        this.router.navigate(['./group', this.service.getUserById(this.service.currentUserId).groupid[0]],
          {relativeTo: this.activatedRoute});
      }
    });

  }

  ngOnInit() {
    this.users = this.service.getAllUser();
    this.groups = this.service.getAllGroupById(this.service.currentUserId);
    this.service.joinGroupEmit.subscribe(() => {
      this.groups = this.service.getAllGroupById(this.service.currentUserId);
      const length = this.groups.length;
      if (length === 0) {
        this.router.navigate(['./allgroup'], {relativeTo: this.activatedRoute});
      } else {
        this.router.navigate(['./group', this.service.getUserById(this.service.currentUserId).groupid[length - 1]],
          {relativeTo: this.activatedRoute});
      }
    });
    this.service.outGroupEmit.subscribe(() => {
      this.groups = this.service.getAllGroupById(this.service.currentUserId);
      if (this.groups.length === 0) {
        this.router.navigate(['./allgroup'], {relativeTo: this.activatedRoute});
      } else {
        this.router.navigate(['./group', this.service.getUserById(this.service.currentUserId).groupid[0]],
          {relativeTo: this.activatedRoute});
      }
    });
  }


}
