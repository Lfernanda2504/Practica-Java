public class Temperatura {
    public static void main(String[] args) {
        //Convertir una temperatura de grados Celsius a Fahrenheit
        int Celcius = 32;
        double Fahrenheit = Celcius * 1.8 + 32 ;
        int temperatura = (int)Fahrenheit;
        System.out.println("La temperatura es igual a " +Fahrenheit +"°F");
        System.out.println(temperatura + "°" +
                "F");
    }
}
