import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int positivo = 0;
        int negativo = 0;

        for (int z = 1; z <= 10; z++) { // z = valiable

            System.out.println("Introducir un número: ");
            int numero = x.nextInt();

            if(numero > 0){
                positivo++;
            }else{
                negativo++;
            }

        } 

        System.out.println("Números positivos: " + positivo);
        System.out.println("Números negativos: " + negativo);
        
        x.close();
    }
}
