package ejercicios;

    
public class Ejercicio38 {
    public static void main(String[] args) {
       
        // El dueño de una tienda compra un artículo a un precio determinado. Obtener
        // el precio al que lo debe vender para obtener una ganancia del 30%.
        
        double articulo = 14.99;
        double ganancia = 0.30;
        
        double articulo_ganancias = articulo*0.3 + articulo;
        System.out.println("El artículo debería valer: " + articulo_ganancias);
        
    }
}