package datos;

import java.util.ArrayList;
import  TiendaMusica.Venta;

/*
 * @author jhon_
 */
public class Registro {
   public static ArrayList<Venta> listaVenta = new ArrayList();

  /* recibe y agrega un objeto venta con un cliente y una colecciòn de productos
   * @param venta 
   */
    public static void ingresarVenta(Venta venta)
    {
        listaVenta.add(venta);
    }

    /**
     * retorna la lista para en la GUI listarla
     * @return listaVenta
     */
    public static ArrayList<Venta> listarVenta()
    {
        return listaVenta;
    }


}
