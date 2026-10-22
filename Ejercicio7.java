import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);

        double suma = 0;  //Guarda la suma de los numeros introducidos
        int contador = 0; //Variables donde guarda cuantas veces ha introducido los numeros
        double numero = 0;  //Variables donde guarda los números introducido

        System.out.println("Introducir un numero positivo(un numero negativo para terminar): ");
        numero = x.nextDouble();

        //Repite una y otra vez, si el numero es mayor igual que 0
        while(numero >= 0){
            suma = suma + numero;  //Acumula los números que introduce el usuario.

            contador ++;  //Para saber cuántos números hemos introducido.

            //pedir otro numero
            System.out.println("Introduce otro número: ");
            numero = x.nextDouble();
        }

         //Si el numero son positivos hace lo siguiente, hasta que se para con numero negativo
        if(contador > 0){

            //Calcular la "suma"y ver la media
            System.out.println("La media es: " + (suma/contador));
            
            //Moastrar cuantos numeros(positivos) se han introducido
            System.out.println("Numeros introducidos son: " + contador);
            
        }else{ //Si introduce numero negativo desde el principio, sale lo siguiente
            System.out.println("No se introdujeron numeros válidos.");
        }
        x.close();
    }
}
