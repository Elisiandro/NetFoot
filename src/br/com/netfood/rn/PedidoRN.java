package br.com.netfood.rn;

import br.com.netfood.bd.PedidoBD;
import br.com.netfood.bean.Pedido;
import br.com.netfood.rnval.PedidoRNval;

public class PedidoRN {
    private final PedidoRNval pedidoRNVal;
    private final PedidoBD pedidoBD;

    public PedidoRN() {
        pedidoRNVal = new PedidoRNval();
        pedidoBD = new PedidoBD();
    }

    public void salvar(Pedido pedido) { 
        pedidoRNVal.validarSalvar(pedido);
        pedidoBD.salvar(pedido);
    }
    
}
