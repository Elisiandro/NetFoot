/*
 * Project: Sistema de Restaurante
 * Data 04/09/2015
 * 
 */
package br.com.netfood.bd;

import br.com.netfood.bean.Mesa;

/**
 *
 * @author Elisiandro
 */
public class MesaBD {
    
    public void salvar(Mesa mesa)
    {
        System.out.println("Gravado: " + mesa);
    }
    public void inserir(Mesa mesa)
    {
        System.out.println("inserido: " + mesa);
    }
    public void deletar(Mesa mesa)
    {
        System.out.println("deletado: " + mesa);
    }
    public Mesa selecionar(int id)
    {
        //System.out.println("Gravado: " + garcon);
        return null;
    }
    
    
}
