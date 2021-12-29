import {EventEmitter, Injectable} from '@angular/core';
import {User} from '../models/user';
import {Group} from '../models/group';
import {Message} from '../models/message';
import {Subject} from 'rxjs';
import {group} from '@angular/animations';
import {Nickname} from '../models/nickname';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  users: User[] = [
    {
      id: 1,
      name: 'Do Van A',
      online: true,
      groupid: []
    },
    {
      id: 2,
      name: 'Do Van B',
      online: true,
      groupid: []
    },
    {
      id: 3,
      name: 'Do Van C',
      online: true,
      groupid: []
    },
    {
      id: 4,
      name: 'Do Van D',
      online: true,
      groupid: []
    }, {
      id: 5,
      name: 'Do Van E',
      online: true,
      groupid: []
    }, {
      id: 6,
      name: 'Do Van F',
      online: true,
      groupid: []
    }
  ];
  groups: Group[] = [
    {
      id: 1,
      name: 'Group 1',
      memberid: [],
      messageid: []
    },
    {
      id: 2,
      name: 'Group 2',
      memberid: [],
      messageid: []
    },
    {
      id: 3,
      name: 'Group 3',
      memberid: [],
      messageid: []
    },
    {
      id: 4,
      name: 'Group 4',
      memberid: [],
      messageid: []
    }, {
      id: 5,
      name: 'Group 5',
      memberid: [],
      messageid: []
    }, {
      id: 6,
      name: 'Group 6',
      memberid: [],
      messageid: []
    }, {
      id: 7,
      name: 'Group 7',
      memberid: [],
      messageid: []
    }
  ];
  messages: Message[] = [];
  nicknames: Nickname[] = [];
  currentUserEmit = new Subject<number>();
  currentGroupEmit = new Subject<number>();
  updateMessageEmit = new Subject();
  outGroupEmit = new Subject();
  joinGroupEmit = new Subject();
  currentUserId: number;
  currentGroupId: number;

  constructor() {
    this.currentUserEmit.subscribe(data => this.currentUserId = data);
    this.currentGroupEmit.subscribe(data => this.currentGroupId = data);
  }

  getAllUser() {
    return this.users;
  }

  getUserById(id: number) {
    return this.users.find(data => data.id === id);
  }

  getAllGroupById(id: number) {
    return this.groups.filter((value) => value.memberid.indexOf(id) !== -1);
  }

  getAllGroupNotJoinById(id: number) {
    return this.groups.filter((value) => value.memberid.indexOf(id) === -1);
  }

  getGroupById(id: number) {
    return this.groups.find((value) => value.id === id);
  }

  // getAllMessages() {
  //   return this.messages;
  // }

  getMessagesByGroupId(id: number) {
    return this.messages.filter((value) =>
      this.getGroupById(id).messageid.indexOf(value.id) !== -1);
  }

  addMessage(contentt: string) {
    const newmessage = {
      id: this.messages.length + 1,
      senderid: this.currentUserId,
      receiverid: this.currentGroupId,
      time: new Date(),
      content: contentt,
      type: true
    };

    this.messages.push(newmessage);

    this.getGroupById(this.currentGroupId).messageid.push(this.messages.length);
  }

  outGroup() {
    const newmessage = {
      id: this.messages.length + 1,
      senderid: this.currentUserId,
      receiverid: this.currentGroupId,
      time: new Date(),
      content: this.getUserById(this.currentUserId).name + ' has left group',
      type: false
    };
    this.messages.push(newmessage);
    this.getGroupById(this.currentGroupId).messageid.push(this.messages.length);
    const ind1 = this.getUserById(this.currentUserId).groupid.indexOf(this.currentGroupId);
    this.getUserById(this.currentUserId).groupid.splice(ind1, 1);
    const ind2 = this.getGroupById(this.currentGroupId).memberid.indexOf(this.currentUserId);
    this.getGroupById(this.currentGroupId).memberid.splice(ind2, 1);

    console.log(this.getGroupById(1).memberid);
    console.log(this.getUserById(this.currentUserId).groupid);
  }

  findNickName(iduser: number, idgroup: number) {
    return this.nicknames.find((value) => value.userid === iduser && value.groupid === idgroup);
  }

  addNickName(idgroup: number, nnickname: string) {
    const newnickname = {
      userid: this.currentUserId,
      groupid: idgroup,
      nickname: nnickname
    };
    this.nicknames.push(newnickname);
    const newmessage = {
      id: this.messages.length + 1,
      senderid: this.currentUserId,
      receiverid: idgroup,
      time: new Date(),
      content: this.getUserById(this.currentUserId).name + ' has join group',
      type: false
    };
    this.messages.push(newmessage);
    this.getGroupById(idgroup).messageid.push(this.messages.length);
    this.getUserById(this.currentUserId).groupid.push(idgroup);
    this.getGroupById(idgroup).memberid.push(this.currentUserId);
  }

  findName(iduser: number) {
    return this.users.find(value => value.id = iduser);
  }
}
