import { Component, OnInit } from '@angular/core';
import { User } from '../models/User';
import { UsersService } from '../Services/users.service';

@Component({
  selector: 'app-a',
  templateUrl: './a.component.html',
  styleUrls: ['./a.component.scss']
})
export class AComponent implements OnInit {

  usuarios:User[]=null;
  valor: string='';
  

  constructor(private _userService:UsersService) { }

  ngOnInit() {
    this.usuarios = this._userService.getUsuarios();
    
  }

  filtraPorNombre(){
    if(this.usuarios){
      return this.usuarios.filter(unU=>{
        return unU.nombre.indexOf(this.valor)>=0;
      });
    }else{
      return this.usuarios;
    }
    }
  }

