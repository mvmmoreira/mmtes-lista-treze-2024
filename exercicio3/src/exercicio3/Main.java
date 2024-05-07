package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valorProduto;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        valorProduto = scanner.nextDouble();
        if (valorProduto == 0){
            System.out.println("Valor invalido");
        }
        else{
            valorProduto = valorProduto + (valorProduto * 0.1);
            System.out.println("O valor do produto é: R$" + valorProduto);
        }
    }
}