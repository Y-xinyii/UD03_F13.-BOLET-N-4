import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        //Contraseña correcta
        int contraseña = 1234;
        //Guardar lo que escribe el usuario
        int combinacion;

        //4 intentos para introducir la contraseña
        for (int i = 1; i <= 4; i++) {  
            System.out.println("Introducir la combinación: ");
            combinacion = x.nextInt();  //Recoge el número que escribe el usuario y lo guarda en "combinacion"

            if (combinacion == contraseña) {

                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
            }else{
                System.out.println("Lo siento, esa no es la combinación.");
            }
        }
        x.close();      
    }
}
