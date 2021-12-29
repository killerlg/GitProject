import {Component, Input, OnInit} from '@angular/core';
import {Group} from '../../../models/group';
import {ServiceService} from '../../../services/service.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-current-group',
  templateUrl: './current-group.component.html',
  styleUrls: ['./current-group.component.css']
})
export class CurrentGroupComponent implements OnInit {
  @Input() groupInput: Group;
  showornot = false;

  constructor(private service: ServiceService, private router: Router, private route: ActivatedRoute) {
  }

  ngOnInit() {
  }

  outGroup() {
    this.service.outGroup();
    this.service.outGroupEmit.next();
    this.service.updateMessageEmit.next();
  }

  changeStt() {
    this.showornot = !this.showornot;
  }
}
