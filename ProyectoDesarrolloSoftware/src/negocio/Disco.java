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
public class Disco extends Producto{
    private String artista;
    private int annio;
    
    public Disco(){
        super();
    }

    public Disco(String artista, int annio, String codigo, String nombre, int precio, int cantidad) {
        super(codigo, nombre, precio, cantidad);
        this.artista = artista;
        this.annio = annio;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artist) {
        this.artista = artista;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }
    
    @Override
    public String toString()
    {
        return "=== Informacion Album === \n"+
                "Codigo:"+super.codigo+"\n"+
                "Nombre:"+super.nombre+"\n"+
                "Precio:"+super.precio+"\n"+
                "Artista:"+artista+"\n"+
                "Año:"+annio+"\n";
                
                
    }
}
