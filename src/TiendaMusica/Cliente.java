/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaMusica;

/**
 *
 * @author matia
 */
public class Cliente {
    private String nombreCliente;
    private String rut;

    public Cliente() {
    }

    public Cliente(String nombreCliente, String rut) {
        this.nombreCliente = nombreCliente;
        this.rut = rut;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
}