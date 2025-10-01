package ejercicios;


import java.util.Scanner;


public class Ejercicio36 {
    public static void main(String[] args) {
       
        // Escribe un programa que pida una hora expresada como horas y minutos y
        // calcule los segundos que faltan para llegar a la medianoche
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Introduce las horas (0-23): ");
        int horas;
        horas = in.nextInt();
        
        System.out.print("Introduce los minutos (0-59): ");
        int minutos;
        minutos = in.nextInt();
        
        int totalSegundosDia = 24 * 60 * 60;
        
        int segundosTranscurridos = horas * 3600 + minutos * 60;
        
        int segundosRestantes = totalSegundosDia - segundosTranscurridos;
        System.out.print("Los segundos que faltan para que acabe el dia son: " + segundosRestantes);
            
    }
}