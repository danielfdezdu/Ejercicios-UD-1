package ejercicios;


public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        Declara e inicializa una variable entera en la que se almacenar� un n�mero de
        cuatro cifras. Se pretende desglosar ese n�mero en millares, centenas,
        decenas y unidades.
        Por ejemplo, dado el n�mero 4.321, la aplicaci�n indicar�:
        a) 4 millares.
        b) 3 centenas.
        c) 2 decenas.
        d) 1 unidad.
        */
       
        int n = 4321;
        
        int millares;
        int centenas;
        int decenas;
        int unidades;
        
        millares = n / 1_000;
        centenas = (n % 1000) / 100;
        decenas = (n % 100) / 10;
        unidades = n % 10;
        
        System.out.println(millares + " millares");
        System.out.println(centenas + " centenas");
        System.out.println(decenas + " decenas");
        System.out.println(unidades + " unidades");
        
        
        
        
        
        System.out.println();
        
        
        
        
        
        
        
    }
}