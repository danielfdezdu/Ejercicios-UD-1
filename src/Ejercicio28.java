
public class Ejercicio28 {
    public static void main(String[] args) {

        int a = 2;
        int b = 10;
        int c = 2;

        int parte1 = -b;
        int parte2 = (b * b - 4 * a * c) / (2 * a);
        int parte3 = b / a;

        int resultado = parte1 + parte2 + parte3;

        System.out.println("El resultado es: " + resultado);
    }
}
