import { Component, OnInit } from '@angular/core';
import { Pedidos } from 'src/app/models/Pedidos';
import { PedidosService } from 'src/app/Services/pedidos.service';

@Component({
  selector: 'app-new-pedido',
  templateUrl: './new-pedido.component.html',
  styleUrls: ['./new-pedido.component.scss']
})
export class NewPedidoComponent implements OnInit {

  nuevoPedido: Pedidos = new Pedidos(0, "", 0);


  constructor(private _pedidosServices:PedidosService) { }

  ngOnInit() {
  }
  

  addPedidos() {
    console.log(this.nuevoPedido);
    // this._pedidosServices.addPedidos(this.nuevoPedido)
    this._pedidosServices.addPedidosAPI(this.nuevoPedido).subscribe(PedidoRec=>{
      this.nuevoPedido=PedidoRec;
    })
  }

}
