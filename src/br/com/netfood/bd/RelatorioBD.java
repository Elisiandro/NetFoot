/*
 * Project: Sistema de Restaurante
 * Data 04/09/2015
 * 
 */
package br.com.netfood.bd;

import br.com.netfood.bean.Relatorio;

/** 
 *
 * @author Elisiandro
 */
public class RelatorioBD {
    
    public void salvar(Relatorio relatorio)
    {
        System.out.println("Gravado: " + relatorio);
    }
    public void inserir(Relatorio relatorio)
    {
        System.out.println("inserido: " + relatorio);
    }
    public void deletar(Relatorio relatorio)
    {
        System.out.println("deletado: " + relatorio);
    }
    public Relatorio selecionar(int id)
    {
        //System.out.println("Gravado: " + garcon);
        return null;
    }
    
    
}
