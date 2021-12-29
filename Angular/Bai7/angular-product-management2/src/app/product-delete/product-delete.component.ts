import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {ProductService} from '../service/product.service';

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {

  productForm = new FormGroup({
      _id: new FormControl(),
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl()
  });
  id: string;

  constructor(private productService: ProductService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = paramMap.get('id');
      this.getProduct(this.id);

    });
  }

  ngOnInit() {
  }

  getProduct(id: string) {
    return this.productService.findById(id).subscribe(product => {
      this.productForm.patchValue(product.data);
      console.log(product.data);
    });
  }

  deleteProduct(id: string) {
    this.productService.deleteProduct(id).subscribe(() => {
      this.router.navigate(['/product/list']);
    }, error => console.log(error));

  }
}
