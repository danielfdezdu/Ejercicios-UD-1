
public class Ejercicio16 {
    public static void main(String[] args) {
       
    /*
        Una aplicaci�n utiliza una variable de tipo entero llamada contador cuyos
        valores deben estar en el rango [0, 10). Al incrementar el valor de la variable
        debe permanecer siempre dentro del rango anterior trabajando de forma
        circular. Por ejemplo, si su valor es 8, al incrementarla valdr� 9, pero, si se
        vuelve a incrementar, valdr� 0.
        Escribir una aplicaci�n que, independientemente del valor inicial de la variable,
        la incremente en una unidad y permanezca siempre dentro del rango anterior.
        El incremento de la variable se debe hacer en una �nica instrucci�n.
    */ 
        
        int contador = 0;
        
        contador = ++contador % 10;
        System.out.println(contador);
    
    
    
    
        
    }
}