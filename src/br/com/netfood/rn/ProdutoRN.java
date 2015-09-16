package br.com.netfood.rn;

import br.com.netfood.bd.ProdutoBD;
import br.com.netfood.bean.Produto;
import br.com.netfood.rnval.ProdutoRNval;

public class ProdutoRN {
    private final ProdutoRNval produtoRNVal;
    private final ProdutoBD produtoBD;

    public ProdutoRN() {
        produtoRNVal = new ProdutoRNval();
        produtoBD = new ProdutoBD();
    }

    public void salvar(Produto produto) { 
        produtoRNVal.validarSalvar(produto);
        produtoBD.salvar(produto);
    }
    
}
