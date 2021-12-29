import {Message} from './message';
import {User} from './user';

export interface Group {
  id: number;
  name: string;
  memberid: number[];
  messageid: number[];
}
