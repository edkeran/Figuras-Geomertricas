
package figurasgeometricas;
/**
 * Clase que maneja la figura geometricas circulo y sus operaciones
 * @author Michael Cardenas
 * @author Edgar Kreicj
 */
public class Circulo {
    private Punto punto;
    private double radio;
    static final double PI=3.141592;

    /**
     * 
     * @param punto una cooordenada en el plano cartesiano
     * @param radio mitad de la circunferencia
     */
    public Circulo(Punto punto, double radio) {
        this.punto = punto;
        this.radio = radio;
    }
    /**
     * metodo publico que encapsula a los privados
     */
    public void IniciarCirculo(){
            System.out.println("AREA = " + CalcularArea());
            System.out.println("PERIMETRO = " + CalcularPerimetro());
            System.out.println("DIAMETRO= " + CalcularDiametro());
    }
    
      private double CalcularArea(){
          return PI*Math.pow(radio,2);
      }
      
      private double CalcularPerimetro(){
          return 2*PI*radio;
      }
      
      private double CalcularDiametro(){
          return radio*2;
      }
      
      /**
     * Metodo encargado de retornar el valor punto de la cordenada
     * @return punto devuelve el valor de la coordenada
     */
    public Punto getPunto() {
        return punto;
    }
    
     /**
     * Modifica el valor x de la cordenada
     * @param Punto Clase que contiene los puntos x y
     * @param punto reeplaza el valor de la coordenada
     */
    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    /**
     * Metodo encargado de retornar el valor punto de la cordenada
     * @return radio retornar el valor del radio
     */
    public double getRadio() {
        return radio;
    }
    
    /**
     * Modifica el valor x de la cordenada
     * @param radio modifica el valor del radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}

