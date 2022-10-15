/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Miguel
 */
public class Apuesta {
    
    private double fondo;
    
    public Apuesta(double fondo){
        this.fondo = fondo;
    }
    
    public void agregarApuesta(double pago){
        this.fondo += pago;
    }
}
