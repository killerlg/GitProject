import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {ProductService} from '../service/product.service';

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {
  productForm = new FormGroup({
    _id: new FormControl(),
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl()
  });
  id: string;

  constructor(private productService: ProductService,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = paramMap.get('id');
      this.getProduct(this.id);
    });
  }

  getProduct(id: string) {
    return this.productService.findById(id).subscribe((product) => {
      this.productForm.patchValue(product.data);
    });
  }

  updateProduct(id: string) {
    const product = this.productForm.value;
    this.productService.updateProduct(id, product).subscribe(() => {
      alert('Cập nhật thành công');
    }, error => console.log(error));

  }

  ngOnInit() {
  }

}
