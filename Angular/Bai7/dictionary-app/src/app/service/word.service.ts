import {Injectable} from '@angular/core';
import {Word} from '../model/word';

@Injectable({
  providedIn: 'root'
})
export class WordService {
  words: Word[] = [{
    word: 'dog',
    mean: 'Con cho'
  }, {
    word: 'cat',
    mean: 'Con meo'
  }, {
    word: 'fish',
    mean: 'Con ca'
  }, {
    word: 'bird',
    mean: 'Con chim'
  }, {
    word: 'shark',
    mean: 'Con ca map'
  }, {
    word: 'dolphin',
    mean: 'Con ca heo'
  }
  ];

  constructor() {
  }

  findByWord(wordinput: string) {
    return this.words.find(word => word.word === wordinput);
  }
  getAll() {
    return this.words;
  }
}
