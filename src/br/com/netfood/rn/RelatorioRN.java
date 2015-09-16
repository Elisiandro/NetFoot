package br.com.netfood.rn;

import br.com.netfood.bd.RelatorioBD;
import br.com.netfood.bean.Relatorio;
import br.com.netfood.rnval.RelatorioRNval;

public class RelatorioRN {
    private final RelatorioRNval relatorioRNVal;
    private final RelatorioBD relatorioBD;

    public RelatorioRN() {
        relatorioRNVal = new RelatorioRNval();
        relatorioBD = new RelatorioBD();
    }

    public void salvar(Relatorio relatorio) { 
        relatorioRNVal.validarSalvar(relatorio);
        relatorioBD.salvar(relatorio);
    }
    
}
