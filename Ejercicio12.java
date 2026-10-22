import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Introducir un número: ");
        int numero = x.nextInt();
         
        int inverso = 0;
        int resto;

        while(numero > 0) {
            resto = numero % 10;
            inverso = inverso * 10 +resto;
            numero = numero / 10;
        }
        System.out.println("Número alrevés: " + inverso);

        x.close();
    }
}
