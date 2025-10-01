
public class Ejercicio16 {
    public static void main(String[] args) {
       
    /*
        Una aplicación utiliza una variable de tipo entero llamada contador cuyos
        valores deben estar en el rango [0, 10). Al incrementar el valor de la variable
        debe permanecer siempre dentro del rango anterior trabajando de forma
        circular. Por ejemplo, si su valor es 8, al incrementarla valdrá 9, pero, si se
        vuelve a incrementar, valdrá 0.
        Escribir una aplicación que, independientemente del valor inicial de la variable,
        la incremente en una unidad y permanezca siempre dentro del rango anterior.
        El incremento de la variable se debe hacer en una única instrucción.
    */ 
        
        int contador = 0;
        
        contador = ++contador % 10;
        System.out.println(contador);
    
    
    
    
        
    }
}