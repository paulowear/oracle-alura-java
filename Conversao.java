import javax.swing.*;

public class Conversao {
    private static int temperaturaEmCelsius = 30;
    private static double conversaoParaFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

    public static void main(String[] args) {
        System.out.println("A temperatura em Celsius é " + temperaturaEmCelsius +
                            " e em  Fahrenheit é " + conversaoParaFahrenheit);

    }
}
