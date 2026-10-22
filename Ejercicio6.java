import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Introducir un número: ");
        int numero = x.nextInt();

        System.out.println("Tabla de multiplicar del numero " + numero);

        for(int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (i * numero));
        }
        x.close();
    }
}
