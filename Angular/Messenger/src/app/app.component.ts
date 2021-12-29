import {Component, ViewEncapsulation} from '@angular/core';
import {User} from './models/user';
import {Message} from './models/message';
import {Group} from './models/group';
import {ServiceService} from './services/service.service';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Messenger';
  users: User[];

  constructor(private service: ServiceService) {
    this.users = this.service.getAllUser();
  }
}
