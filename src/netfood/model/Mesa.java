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
public class Mesa {
   
    private int id;
    private int capacidade;
    
    /**
     * Constructor Mesa
     */
    public Mesa(int _capacidade)
    {     
        this.capacidade = _capacidade; 
        this.id = id++;
    }
    
    /**
     * Inserir uma nova Mesa
     */
    public void inserir(){}    
    /**
     * Alterar uma Mesa
     */
    public void alterar(int id){}
    /**
     * Deletar uma Mesa
     */
    public void deletar(int id){}    
    /**
     * Selecionar uma Mesa
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

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
    
    
}
