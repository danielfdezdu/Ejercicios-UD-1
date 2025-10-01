package ejercicios;


public class Ejercicio34 {
    public static void main(String[] args) {
       
        // Escribe una aplicación para saber el porcentaje de hombres y de mujeres que
        // hay en un grupo de estudiantes, sabiendo que hay 3 mujeres y 22 hombres.
        
        int mujeres = 3;
        int hombres = 22;
        int totalhombresmasmujeres = hombres + mujeres;
        
        double porcentajehombres = (hombres*100)/totalhombresmasmujeres;
        double porcentajemujeres = (mujeres*100)/totalhombresmasmujeres;
        System.out.println("El porcentaje: " + porcentajehombres);
        System.out.println("El porcentaje de mujeres: " + porcentajemujeres);
        
        
        
        
        
        
    }
}