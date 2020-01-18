import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {

  customers = [
    {
      name: 'Rajasekhar',
      email: 'rajasekhar@gmail.com',
      phone: 8865456767
    },
    {
      name: 'Abhilash',
      email: 'abhilash@gmail.com',
      phone: 9876543212
    },
    {
      name: 'Chandan',
      email: 'chandan@gmail.com',
      phone: 8765434354
    },
    {
      name: 'Rahul Kumar',
      email: 'rahul@gmail.com',
      phone: 6785678455
    },
    {
      name: 'Giridhara',
      email: 'giridhara@gmail.com',
      phone: 8776788767
    }
  ];

  constructor() { }

  ngOnInit() {
  }

  deleteCustomer(customers) {
    this.customers.splice(this.customers.indexOf(customers), 1);
  }

}
