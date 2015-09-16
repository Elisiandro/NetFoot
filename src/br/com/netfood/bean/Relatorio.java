/*
 * Project: Sistema de Restaurante
 * Data 04/09/2015
 * 
 */
package br.com.netfood.bean;

import java.util.Objects;

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

    public Relatorio(int id, String nome, double preco, TipoProduto tipoProduto) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.tipoProduto = tipoProduto;
    }

    @Override
    public String toString() {
        return "Relatorio{" + "id=" + id + ", nome=" + nome + ", preco=" + preco + ", tipoProduto=" + tipoProduto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.tipoProduto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Relatorio other = (Relatorio) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
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
