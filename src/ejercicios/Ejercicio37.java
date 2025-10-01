package ejercicios;


public class Ejercicio37 {
    public static void main(String[] args) {
       
        // Obtener el presupuesto que obtendrá cada área teniendo en cuenta que el
        // presupuesto del hospital es de 2.000.000€.
        
        double porcentaje_ginecologia = 0.40;
        double porcentaje_pediatria = 0.30;
        double porcentaje_traumatologia = 0.30;
        double presupuesto_total = 2_000_000.0;
        
        double presupuesto_ginecologia = porcentaje_ginecologia * presupuesto_total;
        System.out.println("El presupuesto para ginecología será: " + presupuesto_ginecologia);
                
        double presupuesto_pediatria = porcentaje_pediatria * presupuesto_total;
        System.out.println("El presupuesto para ginecología será: " + presupuesto_pediatria);
                
        double presupuesto_traumatologia = porcentaje_traumatologia * presupuesto_total;
        System.out.println("El presupuesto para ginecología será: " + presupuesto_traumatologia);
        


        
        
        
        
        
    }
}