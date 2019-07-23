import { Injectable } from '@angular/core';
import { User } from '../models/User';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

 private _usuarios:User[]=[
    new User(1,'Pepe', 'p@p.es', 23),
    new User(2,'Juana', 'j@j.es', 33),
    new User(3,'Rita', 'r@r.es', 43),
    new User(4,'Luis', 'l@l.es', 53)
  ];
  constructor(private _userService:UsersService) { }
  getUsuarios():User[]{
    return this._usuarios;
  }
  addUser(nuevoU:User):boolean{
    nuevoU.uid =(new Date()).getTime();
    this._usuarios.push(nuevoU);
    return true
  }
}
