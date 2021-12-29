import {Component, OnInit} from '@angular/core';
import {ServiceService} from '../../services/service.service';
import {ActivatedRoute, Router} from '@angular/router';
import {Group} from '../../models/group';

@Component({
  selector: 'app-all-group',
  templateUrl: './all-group.component.html',
  styleUrls: ['./all-group.component.css']
})
export class AllGroupComponent implements OnInit {
  allGroup: Group[];

  constructor(private service: ServiceService, private router: Router, private activatedRoute: ActivatedRoute) {
    this.allGroup = this.service.getAllGroupNotJoinById(this.service.currentUserId);
  }

  ngOnInit() {
    this.service.joinGroupEmit
      .subscribe(() => this.allGroup = this.service.getAllGroupNotJoinById(this.service.currentUserId)
  );
  }

  joinGroup(id: number) {
    this.router.navigate(['./', id], {relativeTo: this.activatedRoute});
  }
}
