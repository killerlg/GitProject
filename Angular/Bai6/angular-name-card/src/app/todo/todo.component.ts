import {Component, OnInit} from '@angular/core';
import {Todo} from '../todo';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {TodoService} from '../todo.service';
import {ActivatedRoute, ParamMap} from '@angular/router';

// tslint:disable-next-line:variable-name


@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {
  todos: Todo[] = [];
  todo: Todo;
  content = new FormControl();

  constructor(private todoService: TodoService) {

  }

  ngOnInit() {
    this.todoService.getAll().subscribe((todos) => this.todos = todos);

  }


  toggleTodo(i: number) {
    this.todos[i].complete = !this.todos[i].complete;
    this.todoService.updateTodo(i, this.todo[i]).subscribe(() => console.log('OK'));


  }

  change() {

    const todo = {
      name: this.content.value,
      complete: false
    };
    this.content.reset();

    this.todoService.saveTodo(todo);

  }
}
