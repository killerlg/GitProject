import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {ServiceService} from '../../../services/service.service';

@Component({
  selector: 'app-all-join-group',
  templateUrl: './all-join-group.component.html',
  styleUrls: ['./all-join-group.component.css']
})
export class AllJoinGroupComponent implements OnInit {
  formGroup: FormGroup = new FormGroup({
    nickname: new FormControl(),
    groupid: new FormControl()
  });
  groupid: number;

  constructor(private activatedrouter: ActivatedRoute, private service: ServiceService, private router: Router) {
    this.activatedrouter.paramMap.subscribe(param => {
      this.groupid = +param.get('groupid');
      this.formGroup.patchValue({
        groupid: this.groupid
      });

    });
  }

  ngOnInit() {
  }

  onSubmit() {
    this.service.addNickName(this.groupid, this.formGroup.get('nickname').value);
    this.service.updateMessageEmit.next();
    this.service.joinGroupEmit.next();
    this.formGroup.reset();
  }

}
