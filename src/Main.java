//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Bienbenido(A) a Screen Match");

        System.out.println("Película: Matrix");
        int fechaDeLanzamiento= 1999;
        boolean incluidoEnElPlan = true;
        double notaDelapelicula= 8.2;
        double media = (8.2+ 6.8 +9.8) /3;
        System.out.println(media);
        String sinopsis = """
               El programador informático Thomas Anderson, 
               más conocido en el mundo de los "hacker" como Neo, 
               está en el punto de mira del temible agente Smith. 
               Otros dos piratas informáticos, Trinity y Morfeo, 
               se ponen en contacto con Neo para ayudarlo
                a escapar. Matrix te posee. Sigue al conejo blanco.
                Fué lanzada en:
                """ +fechaDeLanzamiento;
                System.out.println(sinopsis);
                //casting de manera explita
                int clasificacion = (int) (media / 2);
                System.out.println(clasificacion);




    }
}