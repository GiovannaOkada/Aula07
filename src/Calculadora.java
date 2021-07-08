import java.util.Scanner;

public class Calculadora {

	public static void exibirMenu() {
		System.out.println("PROGRAMA CALCULADORA");
		System.out.println("Escolha sua opção!");
		System.out.println("1 - Digitar valores");
		System.out.println("2 - Realizar soma");
		System.out.println("3 - Realizar subtração");
		System.out.println("4 - Realizar divisão");
		System.out.println("5 - Realizar multiplicação");
		System.out.println("6 - Sair");
	}
	
	public static void somar(double valor1, double valor2) {
		double soma;
		System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);
		soma = valor1 + valor2;
		System.out.println("O resultado foi " + soma + "!\n\n");
	}
	
	public static void subtrair(double valor1, double valor2) {
		double subtracao;
		System.out.println("\n\nRealizando a subtração entre " + valor1 + " e " + valor2);
		subtracao = valor1 - valor2;
		System.out.println("O resultado foi " + subtracao + "!\n\n");
	}

	public static void dividir(double valor1, double valor2) {
		double divisao;
		System.out.println("\n\nRealizando a divisão entre " + valor1 + " e " + valor2);
		divisao = valor1 / valor2;
		System.out.println("O resultado foi " + divisao + "!\n\n");
	}
	
	public static void multiplicar(double valor1, double valor2) {
		double multiplicacao;
		System.out.println("\n\nRealizando a multiplicação entre " + valor1 + " e " + valor2);
		multiplicacao = valor1 * valor2;
		System.out.println("O resultado foi " + multiplicacao + "!\n\n");
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1 = 0, valor2=0;
		int opcao = 0;
		
		while (opcao!=6) {
			exibirMenu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\n\nDigite o 1º valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2º valor:");
				valor2 = leitor.nextDouble();
				
				System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
				
				break;
			case 2:
				somar(valor1, valor2);
				break;
			case 3:
				subtrair(valor1, valor2);
				break;
			case 4:
				dividir(valor1, valor2);
				break;
			case 5:
				multiplicar(valor1, valor2);
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
		

	}

}
