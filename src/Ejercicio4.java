

public class Ejercicio4 {
    public static void main(String[] args) {
        
        char a = 'a';
        char z = 'z';
        
        // a contiene el código de la letra 'a' que esw 97
        // Java, al ver que es una variable de tipo char,
        // recurre a la table ASCII e imprime el carácter
        // asociado a su código
        
        System.out.println(a);
        System.out.println(z);
        
        byte n = 97;
        System.out.println((byte)n);
        System.out.println((byte)z);
        
        System.out.println("Número de letras minúsculas: " + ((byte)z - (byte)a + 1));
        
        
        
        
        
        
       
    }
}