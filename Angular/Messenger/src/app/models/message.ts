import {User} from './user';
import {Group} from './group';

export interface Message {
  id: number;
  senderid: number;
  receiverid: number;
  time: Date;
  content: string;
  type: boolean;
}
