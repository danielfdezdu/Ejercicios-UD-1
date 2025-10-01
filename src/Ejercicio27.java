
public class Ejercicio27 {
    public static void main(String[] args) {
       
        // Crea un proyecto que a partir de un ángulo dado expresado en radianes
        // indique a cuántos grados corresponde. Un grado equivale a ?/180. El valor de
        // ? debe declararse como constante.
        
        double radianes = 2.5;
        double PI = Math.PI;

        double grados = radianes * (180 / PI);

        System.out.println(radianes + " radianes equivalen a " + grados + " grados.");
        
    }
}