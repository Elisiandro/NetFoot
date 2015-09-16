/*
 * Project: Sistema de Restaurante
 * Data 04/09/2015
 * 
 */
package br.com.netfood.bean;

import java.util.Objects;

/**
 *
 * @author Elisiandro teste
 */
public class Garcon {
   
    private int id;
    private String nome;
    private double salatio;    
    private String cpf;
    
    /**
     * Constructor Garcon
     */
    public Garcon() {
    }

    public Garcon(int id, String nome, double salatio, String cpf) {
        this.id = id;
        this.nome = nome;
        this.salatio = salatio;
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.id;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.salatio) ^ (Double.doubleToLongBits(this.salatio) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.cpf);
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
        final Garcon other = (Garcon) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Garcon{" + "id=" + id + ", nome=" + nome + ", salatio=" + salatio + ", cpf=" + cpf + '}';
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
