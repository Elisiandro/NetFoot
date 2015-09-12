/*
 * Project: Sistema de Restaurante
 * Data 04/09/2015
 * 
 */
package netfood.model;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Elisiandro
 */
public class Pedido {
   
    private int id;
    private Date data;
    private Mesa mesa;
    private Garcon garcon;
    private List<Produto> listProduto;
    
    private boolean isAberto;
    private double ValorConumido;
    private boolean isComissaoGarcon;
    private double ValorPago;
    
    /**
     * Constructor Pedido
     */
    public Pedido()
    {   
        this.id = id++;
        this.isAberto = true;        
        this.listProduto = new ArrayList<>();
        this.data = new Date();
    }
    
    /**
     * Inserir um novo Pedido
     */
    public void inserir(){}    
    /**
     * Alterar um Pedido
     */
    public void alterar(int id){}
    /**
     * Deletar um Pedido
     */
    public void deletar(int id){}    
    /**
     * Selecionar um Pedido
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Garcon getGarcon() {
        return garcon;
    }

    public void setGarcon(Garcon garcon) {
        this.garcon = garcon;
    }

    public List<Produto> getListProduto() {
        return listProduto;
    }

    public void setListProduto(List<Produto> listProduto) {
        this.listProduto = listProduto;
    }

    public boolean isIsAberto() {
        return isAberto;
    }

    public void setIsAberto(boolean isAberto) {
        this.isAberto = isAberto;
    }

    public double getValorConumido() {
        return ValorConumido;
    }

    public void setValorConumido(double ValorConumido) {
        this.ValorConumido = ValorConumido;
    }

    public boolean isIsComissaoGarcon() {
        return isComissaoGarcon;
    }

    public void setIsComissaoGarcon(boolean isComissaoGarcon) {
        this.isComissaoGarcon = isComissaoGarcon;
    }

    public double getValorPago() {
        return ValorPago;
    }

    public void setValorPago(double ValorPago) {
        this.ValorPago = ValorPago;
    }
   
    
    
    
}
