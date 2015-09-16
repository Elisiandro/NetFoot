/*
 * Project: Sistema de Restaurante
 * Data 04/09/2015
 * 
 */
package br.com.netfood.bean;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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
    public Pedido() {
    }

    public Pedido(int id, Date data, Mesa mesa, Garcon garcon, List<Produto> listProduto, boolean isAberto, double ValorConumido, boolean isComissaoGarcon, double ValorPago) {
        this.id = id;
        this.data = data;
        this.mesa = mesa;
        this.garcon = garcon;
        this.listProduto = listProduto;
        this.isAberto = isAberto;
        this.ValorConumido = ValorConumido;
        this.isComissaoGarcon = isComissaoGarcon;
        this.ValorPago = ValorPago;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", data=" + data + ", mesa=" + mesa + ", garcon=" + garcon + ", listProduto=" + listProduto + ", isAberto=" + isAberto + ", ValorConumido=" + ValorConumido + ", isComissaoGarcon=" + isComissaoGarcon + ", ValorPago=" + ValorPago + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.data);
        hash = 37 * hash + Objects.hashCode(this.mesa);
        hash = 37 * hash + Objects.hashCode(this.garcon);
        hash = 37 * hash + Objects.hashCode(this.listProduto);
        hash = 37 * hash + (this.isAberto ? 1 : 0);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.ValorConumido) ^ (Double.doubleToLongBits(this.ValorConumido) >>> 32));
        hash = 37 * hash + (this.isComissaoGarcon ? 1 : 0);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.ValorPago) ^ (Double.doubleToLongBits(this.ValorPago) >>> 32));
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
        final Pedido other = (Pedido) obj;
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
