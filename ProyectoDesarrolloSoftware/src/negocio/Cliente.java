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
public class Cliente {
    private String nombreCliente;
    private String rut;

    public Cliente() {
    }

    public Cliente(String nombreCliente, String rut) throws Exception {
        setNombreCliente(nombreCliente);
        setRut(rut);
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) throws Exception {
    if (nombreCliente.length()>0)
    {
        this.nombreCliente = nombreCliente;
    }
    else
    {
         throw new Exception("Ingrese el nombre del cliente");
    }
    }
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) throws Exception {
    if (rut.length()==9)
    {
        this.nombreCliente = nombreCliente;
    }
    else
    {
         throw new Exception("Ingrese el rut de cliente sin puntos ni comas");
    }
    }    
}