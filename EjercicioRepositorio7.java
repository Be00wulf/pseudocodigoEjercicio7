//EjercicioRepositorio7
import java.util.Scanner;
public class EjercicioRepositorio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contadorPares = 0, contadorImpares = 0, contadorCeros = 0;
        double aleatorio, porcentajePares, porcentajeImpares, porcentajeCeros;
        
            for(int i = 1; i <= 15; i++){
                aleatorio = (int)(Math.random() * (36));  
                System.out.println("#" + i +" : " +aleatorio);
                
                if (aleatorio % 2 == 0 ) {
                    ++contadorPares;
               
                }   else if (aleatorio == 0) {
                    ++contadorCeros;
                    
                }   else {
                    ++contadorImpares;
                    
                }
                
            }
            
        porcentajePares = (contadorPares * 100)/15; 
    porcentajeImpares = (contadorImpares * 100)/15;
    porcentajeCeros = (contadorCeros * 100)/15;
        
        System.out.println("Porcentaje de numeros pares: " + porcentajePares + "%");
        System.out.println("Porcentaje de numeros impares: " + porcentajeImpares + "%");
        System.out.println("Porcentaje de ceros: " + porcentajeCeros + "%");
    }
}