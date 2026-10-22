import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        

        System.out.println("Introducir un número: ");
        int numero = x.nextInt();

        boolean esPrimo = true;

        if (numero <= 0){
            esPrimo = false;
        }else{
            for (int i = 0; i < numero; i++) {
                if(numero % i == 0){
                    esPrimo = false;
                    break;
                }
         }
            
        }
        if(esPrimo){
            System.out.println("El numero es primo. ");
        }else{
            System.out.println("El nomero no es primo. ");
        }

        x.close();
    }
    
}
