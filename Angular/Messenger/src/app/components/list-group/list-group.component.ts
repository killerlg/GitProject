import {Component, Input, OnInit} from '@angular/core';
import {Group} from '../../models/group';
import {ActivatedRoute, Router} from '@angular/router';
import {ServiceService} from '../../services/service.service';
import {FormControl} from '@angular/forms';

@Component({
  selector: 'app-list-group',
  templateUrl: './list-group.component.html',
  styleUrls: ['./list-group.component.css']
})
export class ListGroupComponent implements OnInit {
  @Input() listGroupInput: Group[];
  constructor(private router: Router,
              private route: ActivatedRoute,
              private service: ServiceService) {
  }
  filterName = '';

  ngOnInit() {
  }

  selectGroup(id: number) {
    this.router.navigate(['./group', id], {relativeTo: this.route});
  }

  joinNewGroup() {
    this.service.joinGroupEmit.next();
    this.router.navigate(['../', this.service.currentUserId, 'allgroup'], {relativeTo: this.route});

  }



}
