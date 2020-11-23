/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import implementacion.Calculable;
import java.util.ArrayList;

/**
 *
 * @author matia
 */
public class Venta  implements Calculable{
    private int numero;
    private String fecha;   
    private Producto producto;
    ArrayList<Producto> venta = new ArrayList();
    
    
    public Venta() {
        producto = new Producto() {};
    }

    public Venta(int numero, String fecha, Cliente cliente) throws Exception {
        setNumero(numero);
        this.fecha = fecha;
        this.producto = producto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws Exception {
      if (numero>0)
      {
        this.numero = numero;
      }
      else
      {
          throw new Exception("Ingrese el numero de venta");
      }
    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
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
