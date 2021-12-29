import {Injectable} from '@angular/core';
import {Category} from '../model/category';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../../environments/environment';
import {ListCategory} from '../model/list-category';

const API_URL = `${environment.apiUrl}`;

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<ListCategory> {
    return this.http.get<ListCategory>(API_URL + '/categories');
  }

  saveCategory(category): Observable<Category> {
    return this.http.post<Category>(API_URL + '/categories', category);
  }

  findById(id: string): Observable<any> {
    return this.http.get<any>(`${API_URL}/categories/${id}`);
  }

  updateCategory(id: string, category: Category): Observable<Category> {
    return this.http.patch<Category>(`${API_URL}/categories/${id}`, category);
  }

  deleteCategory(id: string): Observable<Category> {
    return this.http.delete<Category>(`${API_URL}/categories/${id}`);
  }
}
