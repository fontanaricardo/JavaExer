import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Crie uma função que reaproveite a lógica usada
		 * para verificar se uma variável está vazia e imprimir
		 * "Não informado" na tela
		 */
		
		Scanner scanner = new Scanner(System.in);
		String nome = "";
		String sobrenome = "";
		String apelido = "";
		
		System.out.println("Digite o seu nome: ");
		nome = scanner.nextLine();
		
		if(nome.isEmpty()){
			System.out.println("Não informado");
		}
		
		System.out.println("Digite o seu sobrenome: ");
		nome = scanner.nextLine();
		
		if(sobrenome.isEmpty()){
			System.out.println("Não informado");
		}

		System.out.println("Digite o seu apelido: ");
		apelido = scanner.nextLine();
		if(apelido.isEmpty()){
			System.out.println("Não informado");
		}
	}

}
