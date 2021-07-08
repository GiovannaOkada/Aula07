import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1 = 0, valor2=0;
		
		int opcao = 0;
		
		while (opcao!=6) {
			FuncoesMatematica.exibirMenu();
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
				FuncoesMatematica.somar(valor1, valor2);
				break;
			case 3:
				FuncoesMatematica.subtrair(valor1, valor2);
				break;
			case 4:
				FuncoesMatematica.dividir(valor1, valor2);
				break;
			case 5:
				FuncoesMatematica.multiplicar(valor1, valor2);
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
		

	}

}
