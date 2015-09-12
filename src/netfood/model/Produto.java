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
public class Produto {
   
    private int id;
    private String nome;
    private double preco;
    private TipoProduto tipoProduto;
    
    /**
     * Constructor Mesa
     */
    public Produto(String _nome, double _preco, TipoProduto _tipoProduto)
    {     
        this.nome= _nome   ;
        this.preco = _preco;
        this.tipoProduto = _tipoProduto;
        
        this.id = id++;
    }
    
    /**
     * Inserir um novo Produto
     */
    public void inserir(){}    
    /**
     * Alterar um Produto
     */
    public void alterar(int id){}
    /**
     * Deletar um Produto
     * 
     */
    public void deletar(int id){}    
    /**
     * Selecionar um Produto
     */
    public void selecionar(int id){}

    
    /*
    ############################################################################
    Gets & Sets
    ############################################################################
    */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

   
    
}
