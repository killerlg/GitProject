import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-dynamic-content-one',
  templateUrl: './dynamic-content-one.component.html',
  styleUrls: ['./dynamic-content-one.component.css']
})
export class DynamicContentOneComponent implements OnInit {
  @Input() data: string;
  constructor() { }

  ngOnInit() {
  }

}
