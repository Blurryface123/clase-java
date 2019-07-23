import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'Angular';
  nombre = 'Andres';
  edad:number = 25;

  getName():string{
    return this.nombre+ " "+this.title+ " "+this.edad;
  }
}
