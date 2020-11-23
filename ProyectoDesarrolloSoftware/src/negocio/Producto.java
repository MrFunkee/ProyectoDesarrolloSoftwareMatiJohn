/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;



/**
 *
 * @author matia
 */
public abstract class Producto{
    protected String codigo;
    protected String nombre;
    protected int precio;
    protected int cantidad;
    
    public Producto(){
        
    }
    
    public Producto(String codigo, String nombre, int precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) throws Exception {
     if (codigo.trim().length()>=4)
     {
        this.codigo = codigo;
     }
     else
     {
         throw new Exception("Debe ingresar un código");
     }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
