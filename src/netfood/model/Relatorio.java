/*
 * Project: Sistema de Restaurante
 * Data 04/09/2015
 * 
 */
package netfood.model;

/**
 *
 * @author Elisiandro
 */
public class Relatorio {
   
    private int id;
    private String nome;
    private double preco;
    private TipoProduto tipoProduto;
    
    /**
     * Constructor Relatorio
     */
    public Relatorio()
    {    
    }
    
    /**
     * Mesas mais utilizadas
     */
    public void MesasUtilizadas(){}    
    /**
     * Quantidade de vendas de tal produto
     */
    public void QuantidadeVendas(TipoProduto tipoProduto){}    
    
    /**
     * Lucro do garcon em um determinado mes.
     */
    public void LucroGarcon(int mes){}

    
    
}
