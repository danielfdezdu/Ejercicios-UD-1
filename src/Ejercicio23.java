
public class Ejercicio23 {
    public static void main(String[] args) {
      
        // Suponiendo que ingresamos 5.000€ en un banco que nos paga el 6% de
        // intereses anuales, calcula el dinero que tendremos después de un año.
        
        int ingreso = 5000;
        int intereses = (ingreso*6)/100;
        int total;
        
        total = ingreso + intereses;
        System.out.println(total);
        
        
    }
}