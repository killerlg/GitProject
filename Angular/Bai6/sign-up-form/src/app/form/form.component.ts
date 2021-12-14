import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  constructor() {
  }

  public formGroup = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.minLength(3)]),
    password: new FormControl(),
    confirmPassword: new FormControl(),
    country: new FormControl(),
    age: new FormControl('', [Validators.min(18)]),
    gender: new FormControl(),
    phone: new FormControl('', [Validators.pattern(/^\+84\d{9,10}$/)])
  });

  public country: any = ['Florida', 'South Dakota', 'Tennessee', 'Michigan'];

  ngOnInit() {
  }

  onSubmit() {
    console.log('Success');
  }
}
