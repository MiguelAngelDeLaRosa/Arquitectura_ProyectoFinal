/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablero;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author edw_v
 */
public class Tablero implements Graphic {

    private int numCasillas;
    //El tablero contiene una lista<Graphic> que son las aspas y el centro.
    private List<Graphic> listaGraficos;

    /**
     * Constructor que inicializa los atributos de la clase al valor de los
     * parámetros recibidos. Llena la lista de gráficos con los gráficos
     * necesarios para dibujar el tablero.
     *
     * @param numCasillas
     */
    public Tablero(int numCasillas) {
        this.numCasillas = numCasillas;
        listaGraficos = new ArrayList<>();
        listaGraficos.add(new Centro());
        listaGraficos.add(new Aspa(480, 360, numCasillas, "superior"));
        listaGraficos.add(new Aspa(480, 510, numCasillas, "inferior"));
        listaGraficos.add(new Aspa(380, 460, numCasillas, "izquierda"));
        listaGraficos.add(new Aspa(530, 460, numCasillas, "derecha"));
    }

    /**
     * Método obligatorio que utiliza el panel para dibujar un componente.
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    public void paint(Graphics g) {
        dibujar(g);
    }

    /**
     * Método que recorre y dibuja todos los elementos de la lista de gráficos
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    @Override
    public void dibujar(Graphics g) {
        for (Graphic grafico : listaGraficos) {
            grafico.dibujar(g);
        }
    }

    //MÉTODO PARA REALIZAR PRUEBAS, DEBEMOS ELIMINAR Y CREAR UN NUEVO FRAME PARA QUE SE CREE EL JPANEL DEL TABLERO
    

}
