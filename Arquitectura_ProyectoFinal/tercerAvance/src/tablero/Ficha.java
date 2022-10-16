/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tablero;

import java.awt.Graphics;

/**
 *
 * @author edw_v
 */
public class Ficha implements Graphic{

    private int numeroFicha;
    private int x;
    private int y;
    private final int INGRESAR = 0;
    private final int MOVER = 1;
    private int operacion;
    
    @Override
    public void dibujar(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void ingresar(){
        
    }

}
