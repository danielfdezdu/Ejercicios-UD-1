package ejercicios;

    
public class Ejercicio38 {
    public static void main(String[] args) {
       
        // El due�o de una tienda compra un art�culo a un precio determinado. Obtener
        // el precio al que lo debe vender para obtener una ganancia del 30%.
        
        double articulo = 14.99;
        double ganancia = 0.30;
        
        double articulo_ganancias = articulo*0.3 + articulo;
        System.out.println("El art�culo deber�a valer: " + articulo_ganancias);
        
    }
}