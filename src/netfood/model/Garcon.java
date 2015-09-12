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
public class Garcon {
   
    private int id;
    private String nome;
    private double salatio;    
    private String cpf;
    
    /**
     * Constructor Garcon
     */
    public Garcon(String _nome, double _salario, String _cpf)
    {   
        this.nome = _nome;
        this.salatio = _salario;
        this.cpf = _cpf;
                
        this.id = id++;
    }
    
    /**
     * Inserir um novo Garcon
     */
    public void inserir(){}    
    /**
     * Alterar um Garcon
     */
    public void alterar(int id){}
    /**
     * Deletar um Garcon
     */
    public void deletar(int id){}    
    /**
     * Selecionar um Garcon
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalatio() {
        return salatio;
    }

    public void setSalatio(double salatio) {
        this.salatio = salatio;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
    
}
