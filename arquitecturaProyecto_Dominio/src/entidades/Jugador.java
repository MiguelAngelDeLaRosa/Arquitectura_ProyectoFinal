/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import interfaces.IJugador;
import java.util.List;
import java.util.Objects;

/**
 * 
 * @author Miguel
 */
public class Jugador implements IJugador {
    
    private int id;
    private List<Ficha> fichas;
    private double fondos;
    private String nombre;

    public Jugador() {
    }
    
    public Jugador(int id, List<Ficha> fichas, double fondos, String nombre) {
        this.id = id;
        this.fichas = fichas;
        this.fondos = fondos;
        this.nombre = nombre;
    }
    
    public Jugador(List<Ficha> fichas, double fondos, String nombre) {
        this.fichas = fichas;
        this.fondos = fondos;
        this.nombre = nombre;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    public double getFondos() {
        return fondos;
    }

    public void setFondos(double fondos) {
        this.fondos = fondos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Jugador{" + "fondos=" + fondos + ", nombre=" + nombre + '}';
    }

    @Override
    public boolean moverFicha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double pagarApuesta(double paga) {
        if (getFondos() <= 0){
            System.out.println("Fondos insuficientes");
            return 0;
        } else{
            double pago;
            this.fondos = fondos - paga;
            if (this.fondos <= 0){
                System.out.println("sin fondo");
            }
            pago = paga;
            return pago;
        }
    }
    
    
}
