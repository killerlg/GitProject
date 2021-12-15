import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-img-slider',
  templateUrl: './img-slider.component.html',
  styleUrls: ['./img-slider.component.css']
})
export class ImgSliderComponent implements OnInit {
  status = 0;
  images = [
    {
      name: '1',
      color: 'red'
    }, {
      name: '2',
      color: 'green'
    }, {
      name: '3',
      color: 'blue'
    }, {
      name: '4',
      color: 'black'
    }
  ];

  constructor() {
  }

  ngOnInit() {

  }

  previos() {

    if (this.status === 0) {
      this.status = this.images.length - 1;
    } else {
      this.status--;
    }
  }

  next() {
    if (this.status === 3) {
      this.status = 0;
    } else {
      this.status++;
    }
  }

}
