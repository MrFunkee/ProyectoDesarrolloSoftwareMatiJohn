/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaMusica;

import implementacion.Calculable;
import java.util.ArrayList;

/**
 *
 * @author matia
 */
public class Venta  implements Calculable{
    private int numero;
    private String fecha;   
    private Cliente cliente;
    ArrayList<Producto> venta = new ArrayList();
    
    
    public Venta() {
        cliente = new Cliente();
    }

    public Venta(int numero, String fecha, Cliente cliente) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getVenta() {
        return venta;
    }

    public void setVenta(ArrayList<Producto> venta) {
        this.venta = venta;
    }

    @Override
    public int calcularTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularTotalConDescuento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
