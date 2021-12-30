import {Injectable} from '@angular/core';
import {Product} from '../model/product';
import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Category} from '../model/category';

const API_URL = `${environment.apiUrl}`;

@Injectable({
  providedIn:
    'root'
})
export class ProductService {
  custom: Product = {
    name: 'hello'
  };
  constructor(private http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get<any>(API_URL + '/products');

  }

  saveProduct(product): Observable<Product> {
    return this.http.post<Product>(API_URL + '/products', product);
  }

  findById(id: string): Observable<any> {
    return this.http.get<any>(`${API_URL}/products/${id}`);
  }

  updateProduct(id: string, product: Product): Observable<Product> {
    return this.http.patch<Product>(`${API_URL}/products/${id}`, product);
  }

  deleteProduct(id) {
    return this.http.delete(`${API_URL}/products/${id}`);

  }
}
