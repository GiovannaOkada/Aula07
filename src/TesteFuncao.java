
public class TesteFuncao {

	public static void mais(String[] args) {
		double v1=10, v2=50;
		double resultado;
		resultado = FuncoesMatematica.somarComReturn(v1, v2);
		System.out.println(resultado);
		
		FuncoesMatematica.dividir(FuncoesMatematica.somarComReturn(v1, v2), 3);
		
	}
}
