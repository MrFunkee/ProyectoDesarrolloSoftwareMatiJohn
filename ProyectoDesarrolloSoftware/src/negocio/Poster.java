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
public class Poster extends Producto{
    private String dimension;
    
    public Poster(){
        super();
    }

    public Poster(String dimension, String codigo, String nombre, int precio, int cantidad) {
        super(codigo, nombre, precio);
        this.dimension = dimension;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension)throws Exception {
   if (dimension.length()>0)
    {
        this.dimension = dimension;
    }
    else
    {
         throw new Exception("Ingrese las dimensiones del Poster");
    }
    }   
}
