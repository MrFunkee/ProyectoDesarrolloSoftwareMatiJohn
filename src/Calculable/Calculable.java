/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculable;

/**
 *
 * @author matia
 */
public interface Calculable {
    //Se utilizará para aplicar el descuento el la formula
    final int DESCUENTO = 10;
    //es precio * cantidad
    public int calcularTotal();
    //retornar el total con -10% si es empresa usando la constante
    //si es persona retorne 0
    public int calcularTotalConDescuento();
}
