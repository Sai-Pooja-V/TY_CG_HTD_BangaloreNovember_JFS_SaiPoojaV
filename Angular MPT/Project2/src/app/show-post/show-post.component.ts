import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-show-post',
  templateUrl: './show-post.component.html',
  styleUrls: ['./show-post.component.css']
})
export class ShowPostComponent implements OnInit {

  posts: Posts[];

  constructor(private http: HttpClient) { 
    this.jsonData();
  }

  ngOnInit() {
  }

  jsonData() {
    this.http.get<Posts[]>('../../assets/posts.json').subscribe(response => {
      console.log(response);
      this.posts = response;
    });
  }

}

interface Posts {
  userId: number;
  id: number;
  title: string;
  body: string;
}
