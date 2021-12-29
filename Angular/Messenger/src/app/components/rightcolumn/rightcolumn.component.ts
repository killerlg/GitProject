import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {Group} from '../../models/group';
import {Message} from '../../models/message';
import {ServiceService} from '../../services/service.service';

@Component({
  selector: 'app-rightcolumn',
  templateUrl: './rightcolumn.component.html',
  styleUrls: ['./rightcolumn.component.css']
})
export class RightcolumnComponent implements OnInit {
  group: Group;
  messages: Message[];
  groupid: number;

  constructor(private route: ActivatedRoute, private service: ServiceService) {
    this.route.paramMap.subscribe(param => {
      this.groupid = +param.get('groupid');
      this.service.currentGroupEmit.next(this.groupid);
      this.group = this.service.getGroupById(this.groupid);
      this.messages = this.service.getMessagesByGroupId(this.groupid);
    });
  }

  ngOnInit() {
    //   setInterval(() => {
    //     this.messages = this.service.getMessagesByGroupId(this.groupid);
    //
    //   }, 1000);
    this.service.updateMessageEmit.subscribe(() => {
      this.messages = this.service.getMessagesByGroupId(this.groupid);
    });
  }

}
