
public class EntendendoFuncao {

	public static void saudacao() {
		System.out.println("Ol�, tudo bem?");		
	}
	public static void elogia(String nome) {
		System.out.println("Voc� � muito legal, " + nome);
		nome="";
		System.out.println("Dentro da fun��o, o argumento nome cont�m "+ nome);
	}
	
	public static void main(String[] args) {
		System.out.println("Este c�digo est� na main ANTES de chamar a fun��o");
		saudacao(); //chamada a fun��o
		saudacao();
		saudacao();
		saudacao();
		System.out.println("Este c�digo est� na main DEPOIS de chamar a fun��o");
		elogia("Giovanna");
		String identificacao="Darth Vader";
		elogia(identificacao);
		System.out.println("Aqui na main, a vari�vel identifica��o cont�m " + identificacao);
	}

}
