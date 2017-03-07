/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;


/**
 * Clase que reresenta la figura geometrica Triangulo y saca sus operaciones
 * @author Johans Gonzalez
 */
public class Triangulo {
           
    /**
     * Variable que aloja las cordenadas del lado 1 del triangulo
     */
    private Punto lado1;
    
    /**
     * Variable que aloja las cordenadas del lado 2 del triangulo
     */
    private Punto lado2;
    
    /**
     * Variable que aloja las cordenadas del lado 3 del triangulo
     */    
    private Punto lado3;

    /**
     * Constructor de la clase que inicializa las coordenadas
     * @param lado1 Lado 1 del triangulo
     * @param lado2 Lado 2 del triangulo
     * @param lado3 Lado 3 del trinagulo
     */
    public Triangulo(Punto lado1, Punto lado2, Punto lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public void inicar() {
        if(isTriangulo()) {
            System.out.println("Lado1 = " + darValorLado1());
            System.out.println("Lado2 = " + darValorLado2());
            System.out.println("Lado3 = " + darValorLado3());
            System.out.println("El perimetro es: " + darPerimetro());
            System.out.println("El Area es: " + darArea());
            System.out.println("El Tipo de triangulo es: " + darTipoTriangulo());
        } else {
            System.out.println("Las coordenadas no indican que es un triangulo");
        }    
    }
    
    /**
     * Metodo que valida si es un triangulo
     * @return Verdadero si es triangulo Falso si no lo es
     */
    private boolean isTriangulo() {
        double pendiente1;
        double pendiente2;
        double pendiente3;
        if( (lado1.getX() == lado2.getX()) && (lado2.getX() == lado3.getX()) ){
            return false;
        } else {
            if ( (lado1.getY() == lado2.getY()) && (lado2.getY() == lado3.getY())) {
                return false;
            }
            /**
             * Aqui se evaluan las pendientes de los puntos del triangulo para determinar si pertenecen a una misma recta
             */
            else {
                pendiente1=(lado2.getY()-lado1.getY())/(lado2.getX()-lado1.getX());
                pendiente2=(lado3.getY()-lado2.getY())/(lado3.getX()-lado2.getX());
                pendiente3=(lado3.getY()-lado1.getY())/(lado3.getX()-lado1.getX());
                if ((pendiente1==pendiente2)&&(pendiente2==pendiente3)){
                    return false;
                }
                else {
                    if ((pendiente1==pendiente2)||(pendiente2==pendiente3)||(pendiente1==pendiente3)){
                        return false;
                    }
                }
            }
            
        }
        return true;      
    }
    
    /**
     * Metodo que retorna el valor del lado1 del triangulo
     * @return valorLado
     */
    private double darValorLado1() {
        double valorY = Math.pow(lado2.getY() - lado1.getY(), 2);
        
        double valorX = Math.pow(lado2.getX() - lado1.getX(), 2);
        
        double valorLado = Math.sqrt(valorY + valorX);
               
        return valorLado;
    }
    
    /**
     * Metodo que retorna el valor del lado2 del triangulo
     * @return valorLado
     */
    private double darValorLado2() {
        double valorY = Math.pow(lado3.getY() - lado2.getY(), 2);
        
        double valorX = Math.pow(lado3.getX() - lado2.getX(), 2);
        
        double valorLado = Math.sqrt(valorY + valorX);
               
        return valorLado;
    }
    
    /**
     * Metodo que retorna el valor del lado2 del triangulo
     * @return valorLado
     */
    private double darValorLado3() {
        double valorY = Math.pow(lado1.getY() - lado3.getY(), 2);
        
        double valorX = Math.pow(lado1.getX() - lado3.getX(), 2);
        
        double valorLado = Math.sqrt(valorY + valorX);
               
        return valorLado;
    }
    
    /**
     * Metodo que calcula el perimetro de un triangulo
     * @return perimetro
     */
    private double darPerimetro() {
        return darValorLado1() + darValorLado2() + darValorLado3();
    }
    
    /**
     * Metodo que da el area de un triangulo
     * @return  area
     */
    private double darArea() {
        double s = darPerimetro() / 2;
        
        double valorLado1 = s - darValorLado1();
        double valorLado2 = s - darValorLado2();
        double valorLado3 = s - darValorLado3();
        
        double area = Math.sqrt(s * valorLado1 * valorLado2 * valorLado3);
        return area;
    }
    
    /**
     * Retorna el tipo de triangulo
     * @return TipoTriangulo
     */
    private String darTipoTriangulo() {
        if ((lado1==lado2)||(lado2==lado3)||(lado1==lado3)){
            return "EL TRIANGULO ES ISOSCELES";
        }
        else {
            if ((lado1!=lado2)&&(lado1!=lado3)&&(lado3!=lado2)){
                return "EL TRIANGULO ES ESCALENO";
            }
            else {
                return "EL TRIANGULO ES EQULATERO";
            }
        }   
    }  
    /**
     * Metodo que retorna el lado1 del trinagulo
     * @return lado1 
     */
    public Punto getLado1() {
        return lado1;
    }

    /**
     * Meotod que modifica el lado1 del triangulo
     * @param lado1 
     */
    public void setLado1(Punto lado1) {
        this.lado1 = lado1;
    }

    /**
     * Metodo que retorna el lado2 del trinagulo
     * @return lado2
     */    
    public Punto getLado2() {
        return lado2;
    }

    /**
     * Meotod que modifica el lado2 del triangulo
     * @param lado2
     */    
    public void setLado2(Punto lado2) {
        this.lado2 = lado2;
    }

    /**
     * Metodo que retorna el lado3 del trinagulo
     * @return lado3
     */        
    public Punto getLado3() {
        return lado3;
    }

    /**
     * Meotod que modifica el lado3 del triangulo
     * @param lado3
     */    
    public void setLado3(Punto lado3) {
        this.lado3 = lado3;
    }         
}
