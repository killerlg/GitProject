import {AfterViewInit, Component, ElementRef, Input, OnInit, QueryList, ViewChild, ViewChildren} from '@angular/core';
import {Message} from '../../../models/message';
import {ServiceService} from '../../../services/service.service';

@Component({
  selector: 'app-message',
  templateUrl: './message.component.html',
  styleUrls: ['./message.component.css']
})
export class MessageComponent implements OnInit, AfterViewInit {
  @ViewChildren('messages') messages: QueryList<any>;
  // @ts-ignore
  @ViewChild('content') content: ElementRef;
  @Input() messagesInput: Message[];
  user: number;

  constructor(private service: ServiceService) {
    this.user = this.service.currentUserId;
  }

  ngOnInit() {
    this.service.currentUserEmit.subscribe(() => {
      this.user = this.service.currentUserId;
      console.log(this.user);
    });
  }

  ngAfterViewInit() {
    this.scrollToBottom();
    this.messages.changes.subscribe(this.scrollToBottom);
  }

  scrollToBottom = () => {
    try {
      this.content.nativeElement.scrollTop = this.content.nativeElement.scrollHeight;
    } catch (err) {
    }
  }

}
