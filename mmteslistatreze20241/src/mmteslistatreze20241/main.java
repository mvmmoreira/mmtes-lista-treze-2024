package mmteslistatreze20241;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		String nome, cpf;
		int idade;
		
		usuario usuario = new usuario();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		nome = scanner.nextLine();
		if (nome.isEmpty()) {
			System.out.println("Preencha seu nome");
			return;
		}
		usuario.setNome(nome);
		
		System.out.println("Digite seu cpf");
		cpf = scanner.nextLine();
		if(!validarCPF(cpf)) {
			System.out.println("CPF invalido");
			return;
		}
		usuario.setCpf(cpf);
		
		System.out.println("Digite a idade do usuário: ");
        idade = scanner.nextInt();
        if (idade < 0 || idade > 120) {
            System.out.println("Idade inválida");
            return;
        }
        usuario.setIdade(idade);

        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("Idade: " + usuario.getIdade());
    }

    public static boolean validarCPF(String cpf) {
        return cpf.matches("\\d{11}");
	}

}
