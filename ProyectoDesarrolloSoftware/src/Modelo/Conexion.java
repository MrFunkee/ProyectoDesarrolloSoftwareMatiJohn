/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author matia
 */

    
import TiendaMusica.Disco;
import TiendaMusica.Poster;
import java.sql.*;
import java.util.*;
import TiendaMusica.Producto;

/**
 *
 * @author profesor cfm
 */
public class Conexion {

    private Connection con;
    private Statement state;
//El Puerto lógico de MySql siempre es el 3306 no se cambia
//Cadena de conexiòn
    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia4", "root",null);
            state = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //Para insertar un producto tipo poster, se insertan código, nombre y precio de la clase producto y la variable opcional dimension de Poster
    public void insertarPoster(Poster poster) {
        try {
            conectar();
            state.executeUpdate("INSERT INTO producto(Codigo, Nombre, Precio, Dimension) VALUES('" + poster.getCodigo()
                    + "', '" + poster.getNombre() + "'," + poster.getPrecio() + ",'" + poster.getDimension() + "');");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
        //Para insertar un producto tipo poster, se insertan código, nombre y precio de la clase producto y la variables opcionales banda y annio de Disco
    public void insertarDisco(Disco disco) {
        try {
            conectar();
            state.executeUpdate("INSERT INTO producto(Codigo, Nombre, Precio, Banda, Annio) VALUES('" + disco.getCodigo()
                    + "', '" + disco.getNombre() + "'," + disco.getPrecio() + ",'" + disco.getBanda() + "','" + disco.getAnnio()+"');");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /*
    
    //Busca un medicamento por codigo
    public Medicamento buscar(String codigo) throws SQLException {
        conectar();
        Medicamento med = new Medicamento();
        ResultSet result = state.executeQuery("select * from medicamento Where codigo='" + codigo + "';");
        while (result.next()) {
            med.setCodigo((String) result.getObject(1));
            med.setFarmaco((String) result.getObject(2));
            med.setPrecio((Integer) result.getObject(3));
        }
        return med;
    }
*/
}