import {Component, OnInit} from '@angular/core';
import {ServiceService} from '../../../services/service.service';

@Component({
  selector: 'app-send-message',
  templateUrl: './send-message.component.html',
  styleUrls: ['./send-message.component.css']
})
export class SendMessageComponent implements OnInit {
  content: string;

  constructor(private service: ServiceService) {
  }

  ngOnInit() {
  }

  sendMessage() {
    this.service.addMessage(this.content);
    // console.log(this.service.getAllMessages().length);
    this.content = '';
    this.service.updateMessageEmit.next();
  }
}
