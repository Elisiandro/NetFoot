/*
 * Project: Sistema de Restaurante
 * Data 04/09/2015
 * 
 */
package br.com.netfood.bd;

import br.com.netfood.bean.Produto;

/**
 *
 * @author Elisiandro
 */
public class ProdutoBD {
    
    public void salvar(Produto produto)
    {
        System.out.println("Gravado: " + produto);
    }
    public void inserir(Produto produto)
    {
        System.out.println("inserido: " + produto);
    }
    public void deletar(Produto produto)
    {
        System.out.println("deletado: " + produto);
    }
    public Produto selecionar(int id)
    {
        //System.out.println("Gravado: " + garcon);
        return null;
    }
    
    
}
