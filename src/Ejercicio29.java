
public class Ejercicio29 {
    public static void main(String[] args) {
       
        /*
        La fuerza de atracci�n entre dos masas m1 y m2, separadas por una distancia
        d, est� dada por la f�rmula
        */
        
            final double G =6.673E-8; // E significa 10 elevado a 
            double m1 = 2;
            double m2 = 5;
            double distancia = 14;
        
            double fuerza;
            fuerza = G*(m1*m2)/(distancia*distancia);
            System.out.println(fuerza);
            
            
        
        
        
    }
}