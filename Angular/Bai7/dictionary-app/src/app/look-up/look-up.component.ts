import {Component, OnInit} from '@angular/core';
import {FormGroup} from '@angular/forms';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {Word} from '../model/word';
import {WordService} from '../service/word.service';

@Component({
  selector: 'app-look-up',
  templateUrl: './look-up.component.html',
  styleUrls: ['./look-up.component.css']
})
export class LookUpComponent implements OnInit {
  word: Word;
  constructor(private activatedRoute: ActivatedRoute,
              private wordService: WordService) {
  }

  ngOnInit() {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const wordStr = paramMap.get('word');
      this.word = this.wordService.findByWord(wordStr);
    });
  }

}
