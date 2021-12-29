import {Group} from './group';

export interface User {
  id: number;
  name: string;
  online: boolean;
  groupid: number[];
}
