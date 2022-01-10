import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {MedicalServiceService} from '../../services/medical-service.service';
import {valueReferenceToExpression} from '@angular/compiler-cli/src/ngtsc/annotations/src/util';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  formGroup: FormGroup;


  constructor(private activatedroute: ActivatedRoute,
              private service: MedicalServiceService,
              private router: Router) {
    this.formGroup = new FormGroup({
      idRecord: new FormControl('', [Validators.required]),
      patientId: new FormControl('', [Validators.required]),
      patientName: new FormControl('', [Validators.required, Validators.pattern(/^[A-Za-z\s]+$/)]),
      startIn: new FormControl(),
      startOut: new FormControl(),
      reason: new FormControl('', [Validators.required]),
      treatmentMethods: new FormControl('', [Validators.required]),
      doctorName: new FormControl('', [Validators.required])
    });
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

