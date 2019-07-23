import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AComponent } from './a/a.component';
import { BComponent } from './b/b.component';
import { NewUserComponent } from './users/new-user/new-user.component';
import { NewPedidoComponent } from './pedidos/new-pedido/new-pedido.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path:"login", component: LoginComponent, pathMatch:"full"},
  {path:"a", component: AComponent, pathMatch:"full"},
  {path:"a/new", component: NewUserComponent, pathMatch:"full"},
  {path:"b", component:BComponent, pathMatch:"full"},
  {path:"b/new", component: NewPedidoComponent, pathMatch:"full"},
  {path:"", redirectTo:"a", pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
