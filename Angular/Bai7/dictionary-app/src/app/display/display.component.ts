import {Component, OnInit} from '@angular/core';
import {Word} from '../model/word';
import {WordService} from '../service/word.service';

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css']
})
export class DisplayComponent implements OnInit {
  words: Word[] = [];

  constructor(private wordService: WordService) {
  }

  ngOnInit() {
    this.getAll();
  }

  getAll() {
    this.words = this.wordService.getAll();
  }
}
