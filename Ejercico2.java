public class Ejercico2 {
    public static void main(String[] args) {
        System.out.println("Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.");

        int numero = 0;
        while (numero <= 100){

            System.out.println(numero);  //Este se pone arriba de [numero += 5;] porque así se muestra primero el 0, después +5, vuelve a mostrar 5
            numero += 5;
            
        }
    }
}
