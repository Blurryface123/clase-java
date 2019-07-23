import { Injectable } from '@angular/core';

import { Pedidos } from '../models/Pedidos';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class PedidosService {

  API_URL= 'http://192.168.101.172:8080/PedidosREST/api/pedidos';
 private _pedidos:Pedidos[]=[
    new Pedidos(1,'', 234),
    new Pedidos(2,'', 334),
    new Pedidos(3,'', 434),
    new Pedidos(4,'', 534)
  ];
  constructor(private _http:HttpClient) { }

  getPedidos():Pedidos[] {
     return this._pedidos;
  }
  getPedidosFromApi():Observable<Pedidos[]>{
    return this._http.get<Pedidos[]>(this.API_URL);
  }
  addPedidos(nuevoP:Pedidos):boolean{
    nuevoP.pid =(new Date()).getTime();
    this._pedidos.push(nuevoP);
    return true
  }

  addPedidosAPI(nuevoP:Pedidos):Observable<Pedidos>{
const options={
  headers:{
    "Content-Type":"application/json"
  }
};

const pedidoAEnviar={
  pid:0,
  descripcion: nuevoP.descripcion,
  monto: nuevoP.monto
}

    return this._http.post<Pedidos>(this.API_URL,pedidoAEnviar, options);
   
  }
}
