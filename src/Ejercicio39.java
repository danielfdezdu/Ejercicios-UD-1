
import java.util.Scanner;


public class Ejercicio39 {
    public static void main(String[] args) {
      
/*
        Crea un programa que calcule el sueldo líquido a percibir por un vendedor
        sabiendo que el sueldo total incluye los siguientes conceptos:
        a) Sueldo fijo.
        b) Comisión. Es un 5% sobre el importe de las ventas.
        c) Kilometraje. Se le pagan 0,19€ por kilómetro recorrido.
        d) Dietas. Cobra 30€ por día de desplazamiento.
        A la suma de estos conceptos se le debe descontar una retención del 19% de
        IRPF y 150€ en concepto de Seguridad Social.
*/ 
        
    Scanner in = new Scanner(System.in);
    
    
    System.out.print("Introduce el sueldo fijo: ");
    double sueldoFijo;
    sueldoFijo = in.nextDouble();

    
    System.out.print("Introduce las ventas: ");
    double ventas;
    ventas = in.nextDouble();
    
    double comision = 0.05 * ventas;
    
    System.out.print("Kilometros recorridos: ");
    double kilometros;
    kilometros = in.nextDouble();
    
    double kilometraje = 0.19 * kilometros;
    
    System.out.print("Días de desplazamiento: ");
    double dias;
    dias = in.nextDouble();
    
    double dietas = 30 * dias;
    
    double retencion = 0.19;
    double seguridadSocial = 150;
    
    double sueldoLiquidoantesdedescuento = (sueldoFijo + comision + kilometraje + dietas);
   
    double sueldoLiquido = (sueldoLiquidoantesdedescuento - sueldoLiquidoantesdedescuento*0.19) - 150;
        System.out.println("El sueldo líquido es: " + sueldoLiquido);
    



        
    }
}