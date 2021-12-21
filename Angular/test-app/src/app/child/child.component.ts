import {Component, Input, OnChanges, OnInit, SimpleChanges} from '@angular/core';
import {FormControl} from '@angular/forms';
import {ChildServiceService} from '../child-service.service';


@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit, OnChanges {

  @Input() name: string;
  @Input() person: any;
  nameInput = new FormControl();

  constructor(private childService: ChildServiceService) {


  }

  onSave() {
    this.childService.activatedEmiter.emit(this.nameInput.value);
  }

  ngOnInit() {
    // this.nameInput.valueChanges.subscribe(
    //   (value: string) => {
    //     this.childService.activatedEmiter.emit(value);
    //   }
    // );


  }

  ngOnChanges(changes: SimpleChanges): void {
    this.nameInput.setValue(changes.name.currentValue);
  }


}
