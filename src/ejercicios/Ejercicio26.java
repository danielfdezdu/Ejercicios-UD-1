package ejercicios;

public class Ejercicio26 {
    public static void main(String[] args) {
       
        double pies = 0;
        double pulgadas;
        double yardas;
        double cm;
        double m;
        
        // Calcular las pulgadas. 1 pie = 12 pulgadas
        pulgadas = pies * 12;
        
        // C�lculo de yardas. 1 yarda = 3 pies
        yardas = pies / 3;
        
        // C�lculo cent�metros. 1 pulgada = 2,54 cent�metros
        cm = pulgadas * 2.54;
        
        // C�lculo metros. 1 m = 1000 cm
        m = cm / 100;
        
        System.out.println(pies + "pies equibalen a: ");
        System.out.println("\tPulgadas: " + pulgadas);
        System.out.println("\tYardas: " + yardas);
        System.out.println("\tCent�metros: " + cm);
        System.out.println("\tMetros: " + m);
        
        
    }
}