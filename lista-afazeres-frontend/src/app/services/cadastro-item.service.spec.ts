/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { CadastroItemService } from './cadastro-item.service';

describe('Service: CadastroItem', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [CadastroItemService]
    });
  });

  it('should ...', inject([CadastroItemService], (service: CadastroItemService) => {
    expect(service).toBeTruthy();
  }));
});
