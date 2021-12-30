import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {MedicalServiceService} from '../../services/medical-service.service';
import {valueReferenceToExpression} from '@angular/compiler-cli/src/ngtsc/annotations/src/util';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  formGroup = new FormGroup({
    idRecord: new FormControl(),
    patientId: new FormControl(),
    patientName: new FormControl(),
    startIn: new FormControl(),
    startOut: new FormControl(),
    reason: new FormControl(),
    treatmentMethods: new FormControl(),
    doctorName: new FormControl()
  });


  constructor(private activatedroute: ActivatedRoute,
              private service: MedicalServiceService,
              private router: Router) {
    this.activatedroute.paramMap.subscribe(value => {
      const id = value.get('id');
      this.formGroup.patchValue(this.service.findRecordByIdRecord(id));
    });
  }

  ngOnInit() {

  }


  save() {
    const value = this.formGroup.value;
    this.service.editRecordById(this.formGroup.get('idRecord').value, value);
    this.router.navigate(['/listallrecords']);
  }
}
