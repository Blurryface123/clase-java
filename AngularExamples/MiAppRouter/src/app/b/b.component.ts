import { Component, OnInit } from '@angular/core';
import { Pedidos } from '../models/Pedidos';
import { PedidosService } from '../Services/pedidos.service';
import { Router } from '@angular/router';
import { Route } from '@angular/compiler/src/core';

@Component({
  selector: 'app-b',
  templateUrl: './b.component.html',
  styleUrls: ['./b.component.scss']
})
export class BComponent implements OnInit {
  pedidos:Pedidos[]=null;
  valor: string='';

  constructor(private _pedidosService:PedidosService, private _router:Router) { }

  ngOnInit() {
    const token = localStorage.getItem('token');
    if(token){
      this._pedidosService.getPedidosFromApi().subscribe(losPedidosRecibidos=>{
        this.pedidos=losPedidosRecibidos;
      })
    }else{
      this._router.navigate(['/login']);
    }
    // this.pedidos = this._pedidosService.getPedidos();
    this._pedidosService.getPedidosFromApi().subscribe(losPedidosRecibidos=>{
      this.pedidos=losPedidosRecibidos;
    });
  }

  
  filtraPorDescripcion(){
    if(this.pedidos){
      return this.pedidos.filter(unP=>{
        return unP.descripcion.indexOf(this.valor)>=0;
      });
    }else{
      return this.pedidos;
    }
    }

}
