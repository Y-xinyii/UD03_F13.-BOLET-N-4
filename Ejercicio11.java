import java.util.Scanner;

 class Ejercicio11 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Introducir un numero: ");
        numero1 = x.nextInt();

        System.out.println("Introducir otro numero: ");
        numero2 = x.nextInt();

        while(numero1 == numero2){
            System.out.println("Los números deben ser distintos.");
            System.out.println("Introducir de nuevo el numero2");
                numero2 = x.nextInt();
        }
        if(numero1 > numero2){
            System.out.println("Los numeros de 7 en 7 son: ");
            for(int i = numero2; i <= numero1; i += 7){
                System.out.print(i + " ");
            }
        }else{
            System.out.println("Los numeros de 7 en 7 son: ");
            for(int i = numero1; i <= numero2; i += 7){
                System.out.print(i + " ");
            }            
        }
        x.close();
    }    
}
