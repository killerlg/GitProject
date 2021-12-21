import { TestBed } from '@angular/core/testing';

import { ChildServiceService } from './child-service.service';

describe('ChildServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ChildServiceService = TestBed.get(ChildServiceService);
    expect(service).toBeTruthy();
  });
});
