
public class Ejercicio29 {
    public static void main(String[] args) {
       
        /*
        La fuerza de atracción entre dos masas m1 y m2, separadas por una distancia
        d, está dada por la fórmula
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