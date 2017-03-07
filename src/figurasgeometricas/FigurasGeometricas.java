/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author Johans Gonzalez
 */
public class FigurasGeometricas {

    private Scanner teclado = new Scanner(System.in);
    
    public FigurasGeometricas() {
        solicitarDatos();
    }    
    
    private void solicitarDatos() {        
        
        while(true) {            
            System.out.println("------ BIENVENIDO -------");
            System.out.println("1- Triangulo 2- Circulo 3- Cuadrado 4- Finalizar");
            byte valor = teclado.nextByte();
            if(valor == 1) { //Entra a realizar las operaciones del triangulo
                  realzarOperacionesTriangulo();
            } else if (valor == 2) { //Entra a realizar las operaciones del circulo

            }  else if (valor == 3) { //Entra a realizar las operaciones del cuadrado o rectangulo

            }  else if (valor == 4) { //Entra a realizar las operaciones del cuadrado o rectangulo                
                break;
            } else {
                System.out.println("Tomo una opcion erronea.");
            }        
        }
    }
    
    private void realzarOperacionesTriangulo() {
        double x, y;
        System.out.println("Digite el punto x1: ");        
        x = teclado.nextDouble();
        System.out.println("Digite el punto y1: ");        
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("Digite el punto x2: ");        
        x = teclado.nextDouble();
        System.out.println("Digite el punto y2: ");        
        y = teclado.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.println("Digite el punto x3: ");        
        x = teclado.nextDouble();
        System.out.println("Digite el punto y3: ");        
        y = teclado.nextDouble();
        Punto punto3 = new Punto(x, y);        
        Triangulo triangulo = new Triangulo(punto1, punto2, punto3);
        triangulo.inicar();        
    }
    
}

