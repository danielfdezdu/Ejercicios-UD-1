package ejercicios;


public class Ejercicio33 {
    public static void main(String[] args) {
        
        
        // Un alumno desea saber cuál será su nota final en Programación sabiendo que
        // se compone de los siguientes porcentajes:

        // a) 55% de la media de sus tres evaluaciones parciales.
        // b) 30% de la calificación del examen final.
        // c) 15% de la calificación del trabajo final.
        
        double ev1 = 6.7;
        double ev2 = 5.9;
        double ev3 = 7.2;
        double notaexfinal = 7.7;
        double trabajo = 8.3;
        
        double mediaevaluaciones = (ev1+ev2+ev3)/3;
        
        double notafinal = ((55*mediaevaluaciones)/100)+((30*notaexfinal)/100)+((15*trabajo)/100);
        System.out.println("La nota final del alumno es: " + notafinal);
        
        
        
        
        
        
       
    }
}