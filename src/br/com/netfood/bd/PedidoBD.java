/*
 * Project: Sistema de Restaurante
 * Data 04/09/2015
 * 
 */
package br.com.netfood.bd;

import br.com.netfood.bean.Pedido;

/**
 *
 * @author Elisiandro
 */
public class PedidoBD {
    
    public void salvar(Pedido pedido)
    {
        System.out.println("Gravado: " + pedido);
    }
    public void inserir(Pedido pedido)
    {
        System.out.println("inserido: " + pedido);
    }
    public void deletar(Pedido pedido)
    {
        System.out.println("deletado: " + pedido);
    }
    public Pedido selecionar(int id)
    {
        //System.out.println("Gravado: " + garcon);
        return null;
    }
    
    
}
