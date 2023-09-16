import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Item } from '../model/item';

@Injectable({
  providedIn: 'root'
})
export class CadastroItemService {

  apiUrl = environment.apiUrl;
  
  constructor(private http: HttpClient) { }
  
  cadastrar(item: Item): Observable<any> {
    return this.http.post<any>(this.apiUrl, item);
  }
}
