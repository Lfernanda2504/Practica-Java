import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numRandom = new Random().nextInt(100);
        int intentos = 0;


        while (intentos <5){
            System.out.println("Adivina el numero, ingresa un número del 1 al 100: ");
            int numUser = teclado.nextInt();
            intentos++;

            if( numUser == numRandom){
                System.out.println("Felicidades, adivinaste el número secreto");
                break;
            }
            else if ( numUser < numRandom) {
                System.out.println("el número ingresado es menor al número generado");
            } else {
                System.out.println("el número ingresado es mayor al número generado");
            }

        if (intentos == 5){
            System.out.println("Lo siento, no adivinazte el numero en 5 intentos "+"El numero generado es " + numRandom);
        }

        }
        

    }
}
