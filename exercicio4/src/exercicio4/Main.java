package exercicio4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double temperaturaFahrenheit,temperaturaCelsius;
        
        System.out.println("Digite a temperatura em graus Fahrenheit: ");
         temperaturaFahrenheit = scanner.nextDouble();

         temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8;

        System.out.println("A temperatura em graus Celsius é: " + temperaturaCelsius);
    }
}