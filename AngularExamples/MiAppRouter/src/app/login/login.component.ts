import { Component, OnInit } from '@angular/core';
import { AuthService } from '../Services/auth.service';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  user = {email:"", pass:""};
  constructor(private _auth:AuthService, private _router:Router) { } //Inyectamos el Authservice

  ngOnInit() {
  }

    acceder(){
      console.log(this.user)
      this._auth.login(this.user.email, this.user.pass).subscribe(respuesta =>{
        console.log(respuesta);
        localStorage.setItem('token',respuesta.message);
        this._router.navigate(['/b'])
      })
    }
}
