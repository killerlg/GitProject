import {Component, OnInit} from '@angular/core';
import {FormControl} from '@angular/forms';
import {ChildServiceService} from './child-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  nameInput = new FormControl();
  title = 'test-app';
  name = '';
  person = {
    name: '',
    age: 23
  };

  constructor(private childService: ChildServiceService) {
  }

  onSave() {
    this.name = this.nameInput.value;
    this.person.name = this.nameInput.value;

  }


  ngOnInit(): void {
    this.childService.activatedEmiter.subscribe(
      (value: string) => {
        this.nameInput.setValue(value);
        this.name = value;
        this.person.name = value;
      }
    );

    this.nameInput.valueChanges.subscribe(
      (value: string) => {
        this.name = value;
        this.person.name = value;
      }
    );
  }
}
