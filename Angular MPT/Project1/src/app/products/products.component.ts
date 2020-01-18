import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  products = [
    {
      name: 'Iphone',
      image: 'https://cdn.pixabay.com/photo/2014/08/05/10/30/iphone-410324__340.jpg',
      price: 42999
    }, {
      name: 'Macbook',
      image: 'https://cdn.pixabay.com/photo/2014/05/02/21/50/home-office-336378__340.jpg',
      price: 59999
    }, {
      name: 'Canon DSLR',
      image: 'https://cdn.pixabay.com/photo/2017/03/30/00/17/cameras-2186901__340.png',
      price: 31999
    }, {
      name: 'Boat Headset',
      image: 'https://cdn.pixabay.com/photo/2015/03/26/09/58/headphones-690685__340.jpg',
      price: 1599
    }, {
      name: 'Virtual Reality Play',
      image: 'https://cdn.pixabay.com/photo/2017/02/10/14/10/virtual-2055227__340.png',
      price: 6299
    }
  ];

  constructor() { }

  ngOnInit() {
  }

  deleteProduct(products) {
    this.products.splice(this.products.indexOf(products), 1);
  }

}
