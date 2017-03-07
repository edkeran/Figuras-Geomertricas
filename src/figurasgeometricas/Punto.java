/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 * Clase encargada de alojar una cordenada en el plano cartesiano
 * @author Johans Gonzalez
 */
public class Punto {
    
    /*
    * Variable que aloja el lado x de la cordenada
    */
    private double x;
    
    /**
     * Variable que aloja el lado y de la cordenada
     */
    private double y;

    /**
     * Inicializa la clase con los puntos de referencia
     * @param x lado x en el plano cartesiano
     * @param y lado y en el plano cartesiano
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Metodo encargado de retornar el valor x de la cordenada
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * Modifica el valor x de la cordenada
     * @param x remplaza el valor x de la cordenada
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Metodo encargado de retornar el valor y de la cordenada
     * @return y
     */    
    public double getY() {
        return y;
    }

    /**
     * Modifica el valor x de la cordenada
     * @param y remplaza el valor y de la cordenada
     */    
    public void setY(double y) {
        this.y = y;
    }              
    
}
