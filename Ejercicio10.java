import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int numero = 0;
        int suma = 0;

        System.out.println("Introducir un numero: ");
        numero = x.nextInt();

        while(numero <= 0){
            System.out.println("Error. Introducir un numero positivo.");
            numero = x.nextInt();
        }

        for(int i = numero + 1; i <= numero + 100; i++) {
            suma = suma + i;
        }
        System.out.println("La suma es: " + suma);

        x.close();
    }
}
