package ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;
        int temporal;
        
        System.out.println("Situaci�n inicial");
        System.out.println("a =" + a);
        System.out.println("b = " + b);
        
        temporal = a;
        a = b;
        b = temporal;   
        
        System.out.println("Situaci�n despu�s del intercambio");
        System.out.println("a =" + a);
        System.out.println("b = " + b);
        
        
       
       
    }

}