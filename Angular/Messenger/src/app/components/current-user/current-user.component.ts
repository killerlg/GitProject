import {Component, Input, OnInit} from '@angular/core';
import {ServiceService} from '../../services/service.service';
import {User} from '../../models/user';

@Component({
  selector: 'app-current-user',
  templateUrl: './current-user.component.html',
  styleUrls: ['./current-user.component.css']
})
export class CurrentUserComponent implements OnInit {
  @Input() inputCurrentUser: User;
  constructor() {
  }

  ngOnInit() {
  }


}
