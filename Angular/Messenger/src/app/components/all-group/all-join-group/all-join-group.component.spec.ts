import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AllJoinGroupComponent } from './all-join-group.component';

describe('AllJoinGroupComponent', () => {
  let component: AllJoinGroupComponent;
  let fixture: ComponentFixture<AllJoinGroupComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AllJoinGroupComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AllJoinGroupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
