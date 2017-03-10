
package figurasgeometricas;
/**
 * Clase que representa la figura geometrica Cuadrado y saca sus operaciones
 * @author Michael Cardenas
 * @author Edgar Krejci
 */
public class Cuadrado {
    
    /**
     * Variable que aloja las cordenadas del lado 1 del cuadrado/rectangulo
     */
    private Punto ladoA;
    
    /**
     * Variable que aloja las cordenadas del lado 2 del cuadrado/rectangulo
     */
    private Punto LadoB;
    
    /**
     * Variable que aloja las cordenadas del lado 3 del cuadrado/rectangulo
     */
    private Punto LadoC;
    
    /**
     * Variable que aloja las cordenadas del lado 4 del cuadrado/rectangulo
     */
    private Punto LadoD;

    /**
     * Constructor de la clase que inicializa las coordenadas
     * @param ladoA lado1 del cuadrado/rectangulo
     * @param LadoB lado2 del cuadrado/rectangulo
     * @param LadoC lado3 del cuadrado/rectangulo
     * @param LadoD lado4 del cuadrado/rectangulo
     */
   
    public Cuadrado(Punto ladoA, Punto LadoB, Punto LadoC, Punto LadoD) {
        this.ladoA = ladoA;
        this.LadoB = LadoB;
        this.LadoC = LadoC;
        this.LadoD = LadoD;
    }
    /**
     * metodo publico que recoje los metodos privados 
     */
     public void iniciar() {
         if(IsCuadrado()){
            System.out.println("LadoA = " + CalcularLado1());
            System.out.println("LadoB = " + CalcularLado2());
            System.out.println("LadoC = " + CalcularLado3());
            System.out.println("LadoD = " + CalcularLado4());
            System.out.println("El perimetro es: " + CalcularPerimetro());
            System.out.println("El Area es: " + CalcularArea());
         }else{
              System.out.println("Las coordenadas no indican que es un cuadrado o rectangulo");
         } 
     } 
    /**
     * Metodo que valida si las coordenadas ingresadas corresponden a un cuadrado o no
     * @return true en caso de que las coordenadas sean correctas y 
     * false en caso de que no lo sean
     */
        private boolean IsCuadrado(){
          if (((ladoA.getX()==LadoB.getX())&&(LadoB.getY()!=ladoA.getY())&&(LadoB.getY()==LadoC.getY())&&(LadoB.getX()!=LadoC.getX())&&(ladoA.getY()==LadoD.getY())&&(ladoA.getX()!=LadoD.getX()))&&((LadoC.getX()==LadoD.getX())&&(LadoC.getY()!=LadoD.getY()))){
              return true;
          }
          else {
              if (((ladoA.getY()==LadoB.getY())&&(LadoB.getX()!=ladoA.getX())&&(LadoB.getX()==LadoC.getX())&&(LadoB.getY()!=LadoC.getY())&&(ladoA.getX()==LadoD.getX())&&(ladoA.getY()!=LadoD.getY()))&&((LadoC.getY()==LadoD.getY())&&(LadoC.getX()!=LadoD.getX()))){
                  return true;
              }
              else{
                  return false;
              }
          }
       }
       /**
        * Metodo que calcula lo longitud de A a B
        * @return ValorLado retorna el resultado de las operaciones
        */
         private double CalcularLado1(){
            double valorY = Math.pow(LadoB.getY()- ladoA.getY(), 2);
            double valorX = Math.pow(LadoB.getX() - ladoA.getX(), 2);
            double valorLado = Math.sqrt(valorY + valorX);
            
            return valorLado;
       }
         /**
          * metodo que calcula la longitud de B a C
          * @return valorLado2 devuelve el resultado de las operaciones
          */
         private double CalcularLado2(){
            double valorY = Math.pow(LadoB.getY()- LadoC.getY(), 2);
            double valorX = Math.pow(LadoB.getX() - LadoC.getX(), 2);
            double valorLado2 = Math.sqrt(valorY + valorX);
            
            return valorLado2;
       }
         /**
          * metodo que calcula la longitud de C a D
          * @return valorLado3 devuelve el resultado de las operaciones
          */
         private double CalcularLado3(){
            double valorY = Math.pow(LadoC.getY()- LadoD.getY(), 2);
            double valorX = Math.pow(LadoC.getX() - LadoD.getX(), 2);
            double valorLado3 = Math.sqrt(valorY + valorX);
            
            return valorLado3;
       }
         /**
          * metodo que calcula la longitud de D a A
          * @return valorLado4 devuelve el resultado de las operaciones
          */
         private double CalcularLado4(){
            double valorY = Math.pow(LadoD.getY()- ladoA.getY(), 2);
            double valorX = Math.pow(LadoD.getX() - ladoA.getX(), 2);
            double valorLado4 = Math.sqrt(valorY + valorX);
            
            return valorLado4;
       }
         /**
          * 
          * @return devuelve el valor del perimetro
          */
         private double CalcularPerimetro(){
             return CalcularLado1() + CalcularLado2() + CalcularLado3() + CalcularLado4();
         }
         
         /**
          * 
          * @return devuelve el valor del area
          */
         private double CalcularArea(){
             return CalcularLado1() * CalcularLado4();
         }
        
         /**
     * Metodo encargado de retornar el valor x de la cordenada
     * @return ladoA
     */
    public Punto getLadoA() {
        return ladoA;
    }
    
    /**
     * Modifica el valor ladoA de la cordenada
     * @param Punto Clase que contiene los puntos x y
     * @param ladoA reeplaza el valor de la coordenada
     */
    public void setLadoA(Punto ladoA) {
        this.ladoA = ladoA;
    }
    
    /**
     * Metodo encargado de retornar el valor LadoB de la cordenada
     * @return LadoB
     */
    public Punto getLadoB() {
        return LadoB;
    }
    
     /**
     * Modifica el valor LadoB de la cordenada
     * @param Punto Clase que contiene los puntos x y
     * @param LadoB reeplaza el valor de la coordenada
     */
    public void setLadoB(Punto LadoB) {
        this.LadoB = LadoB;
    }
    
     /**
     * Metodo encargado de retornar el valor LadoC de la cordenada
     * @return LadoC
     */
    public Punto getLadoC() {
        return LadoC;
    }
     /**
     * Modifica el valor x de la cordenada
     * @param Punto Clase que contiene los puntos x y
     * @param LadoC reeplaza el valor de la coordenada
     */
    public void setLadoC(Punto LadoC) {
        this.LadoC = LadoC;
    }
     /**
     * Metodo encargado de retornar el valor LadoD de la cordenada
     * @return LadoD 
     */
    public Punto getLadoD() {
        return LadoD;
    }
     /**
     * Modifica el valor x de la cordenada
     * @param Punto Clase que contiene los puntos x y
     * @param LadoD reeplaza el valor de la coordenada
     */
    public void setLadoD(Punto LadoD) {
        this.LadoD = LadoD;
    } 
}
    

