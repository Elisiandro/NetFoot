/*
 * Project: Sistema de Restaurante
 * Data 04/09/2015
 * 
 */
package br.com.netfood.bd;

import br.com.netfood.bean.Garcon;

/**
 *
 * @author Elisiandro
 */
public class GarconBD {
    
    public void salvar(Garcon garcon)
    {
        System.out.println("Gravado: " + garcon); // ss
    }
    public void inserir(Garcon garcon)
    {
        System.out.println("inserido: " + garcon);
    }
    public void deletar(Garcon garcon)
    {
        System.out.println("deletado: " + garcon);
    }
    public Garcon selecionar(int id)
    {
        //System.out.println("Gravado: " + garcon);
        return null;
    }
    
    
}
