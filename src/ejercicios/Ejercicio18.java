package ejercicios;


public class Ejercicio18 {
    public static void main(String[] args) {
       
        /*
        
        Crea un proyecto Java que declare e inicialice cuatro variables de tipo int con
        cualquier valor y realice los siguientes cálculos:
        
        a) La suma de las cuatro variables.
        b) El producto de la primera variable por 100.
        c) La división real de la segunda por tres.
        d) La parte entera de la división de la tercera variable dividida por la
        cuarta.
        e) El resto de la división de la primera entre la segunda variable
        
        */
        
        int a = 2;
        int b = 10;
        int c = 6;
        int d = 8;
        
        int suma = a+b+c+d;
        System.out.println(suma);
        int productoa = a*100;
        System.out.println(productoa);
        double divisionb = (double)b/3;
        System.out.println(divisionb);
        int parteentera = c / d;
        System.out.println(parteentera);
        int resto = a % b;
        System.out.println(resto);
        
        
        
        
        
        
    }
}