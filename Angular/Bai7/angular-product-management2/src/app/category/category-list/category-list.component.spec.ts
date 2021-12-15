import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CategpryListComponent } from './category-list.component';

describe('CategpryListComponent', () => {
  let component: CategpryListComponent;
  let fixture: ComponentFixture<CategpryListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CategpryListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CategpryListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
