package aula05;

public class PassagensValorReferência {

	public static void main(String[] args) {
		
		// a identidade da função é o nome e o parâmetro

		int a = 2;
		int dobroA = passagemPorValor(a);
		
		System.out.println(dobroA);
		System.out.println(a);
		
		Integer b = 2;
		int dobroB = passagemPorReferencia(b);

		System.out.println(dobroB);
		System.out.println(b);
	}
	
	public static int passagemPorReferencia(Integer x) {
		x = x * 2;
		return x;
	}
	
	public static int passagemPorValor(int x) {
		x = x * 2;
		return x;
	}
	
	public static void finalização() { // o void não retorna nada
		int resultado = somar(1, 2);
		imprimir(resultado);
		
		somar(3.2f, 8.3f); // Java sabe que precisa utilizar a função somar que possui 2 parâmetros tipo float, ainda que tenha outra função somar de 2 parâmetros
		somar(3, 8, 4); // Java sabe que precisa utilizar a função somar que possui 3 parâmetros inteiros
	}
	
	public static void imprimir(int conteudo) {
		System.out.println(conteudo); //o conteudo vai ser referenciado ao que eu selecionar para mostrar, como visto na finalização ()
	}
	
	public static int somar(int x, int y) {
		int soma = x + y;
		return soma;
	}
	
	public static int somar(int x, int y, int z) {
		int soma = x + y;
		return soma;
	}
	
	public static float somar(float x, float y) {
		float soma = x + y;
		return soma;
	}
}
