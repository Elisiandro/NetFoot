/*
 * Project: Sistema de Restaurante
 * Data 04/09/2015
 * 
 */
package br.com.netfood.bean;

/**
 *
 * @author Elisiandro
 */
public class Mesa {
   
    private int id;
    private int capacidade;
    
    /**
     * Constructor Mesa
     */
    public Mesa()
    {
    }

    public Mesa(int id, int capacidade) {
        this.id = id;
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Mesa{" + "id=" + id + ", capacidade=" + capacidade + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
        hash = 59 * hash + this.capacidade;
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
        final Mesa other = (Mesa) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
   
    
    
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

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    
    
    
    
}
