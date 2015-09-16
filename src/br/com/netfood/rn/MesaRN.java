package br.com.netfood.rn;

import br.com.netfood.bd.MesaBD;
import br.com.netfood.bean.Mesa;
import br.com.netfood.rnval.MesaRNval;

public class MesaRN {
    private final MesaRNval mesaRNVal;
    private final MesaBD mesaBD;

    public MesaRN() {
        mesaRNVal = new MesaRNval();
        mesaBD = new MesaBD();
    }

    public void salvar(Mesa mesa) { 
        mesaRNVal.validarSalvar(mesa);
        mesaBD.salvar(mesa);
    }
    
}
