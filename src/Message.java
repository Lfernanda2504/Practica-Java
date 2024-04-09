import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        /*
        el método format() de la clase String.
         Este método permite formatear un texto utilizando marcadores
          de posición (placeholders), que se representan con el
          carácter % seguido de una letra que indica
        el tipo de dato que se insertará en el marcador de posición
        * */
        String nombre = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));
        int aulas = 4;

        String message = """
                Hola, %s!
                Bienvenido al curso de Java.
                Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje""".formatted(nombre, aulas);

        System.out.println(message);


        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("El día 1 es lunes");
                break;
            case 2:
                System.out.println("El día 2 es martes");
                break;
            case 3:
                System.out.println("El día 3 es miércoles");
                break;
            // otros casos posibles...
            default:
                System.out.println("Día no válido");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double value = scanner.nextDouble();

        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + value + " esse mês.");

        scanner.close();




    }


}
