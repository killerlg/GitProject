import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, ValidationErrors, ValidatorFn, Validators} from '@angular/forms';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  constructor() {
  }
  public country: any = ['Florida', 'South Dakota', 'Tennessee', 'Michigan'];

  public formGroup = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.minLength(3), Validators.email]),
    password: new FormControl('', [Validators.required, Validators.minLength(6)]),
    confirmPassword: new FormControl('', [Validators.required, Validators.minLength(6)]),
    country: new FormControl(),
    age: new FormControl('', [Validators.min(18)]),
    gender: new FormControl(),
    phone: new FormControl('', [Validators.pattern(/^\+84\d{9,10}$/)])
  }, [forbiddenNameValidator]);



  ngOnInit() {
  }

  onSubmit() {
    console.log('Success');
  }
}

function forbiddenNameValidator(formGroup: FormGroup): { [s: string]: boolean } {
  if (formGroup.get('password').value !== formGroup.get('confirmPassword').value) {
    return {dontMatchPassword: true};
  }
  return null;
}
