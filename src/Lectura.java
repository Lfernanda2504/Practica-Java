import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el nombre de tu película favorita");
        //nextxxx depende del tipo de dato que estemos leyendo
        //String
        String pelicula = teclado.nextLine();
        //Integer
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        //Double
        System.out.println("Por ultimo dinos que nota le das a esta película ");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
