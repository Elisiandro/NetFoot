package br.com.netfood.rn;

import br.com.netfood.bd.GarconBD;
import br.com.netfood.bean.Garcon;
import br.com.netfood.rnval.GarconRNval;

public class GarconRN {
    private final GarconRNval garconRNVal;
    private final GarconBD garconBD;

    public GarconRN() {
        garconRNVal = new GarconRNval();
        garconBD = new GarconBD();
    }

    public void salvar(Garcon garcon) {
        garconRNVal.validarSalvar(garcon);
        garconBD.salvar(garcon);
    }
    
}
