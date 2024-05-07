package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		
		Double a,b,media;
		
		System.out.println("Digite um numero");
		a = scanner.nextDouble();
		
		System.out.println("Digite um numero");
		b = scanner.nextDouble();
		
		media = (a+b)/2;
		
		System.out.println("A media dos dois numeros escolhidos é "+ media);
		
		
		
	}

}
