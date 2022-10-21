package aula04;

import java.util.Scanner;

public class Exercício2Aula04 {

	public static void main (String[] args) {
		resoluçãoIsabella();
	}
		
		
	public static void resoluçãoAula () {
		Scanner scan = new Scanner (System.in);
		final int MAX = 100;
		int [] numeros = new int [MAX];
		int controle = 0;
		int n = -1;
		
		do {
			System.out.println("Digite o número ou zero para parar: ");
			n = scan.nextInt();
			if (n == 0) {
				break;
			}
			numeros [controle] = n;
			controle ++;
			
		}while (controle < MAX );
		
		int [] inversao = new int [controle];//novo vetor com a quantidade de números que entrou
		
		for (int i = 0; i < controle; i++) {
			System.out.printf("%d\n", numeros [i]);
		}
				
		for (int i = 0; i < controle; i++) {
			inversao[i] = numeros [controle - i - 1]; // total de números que entrou menos um, pra coincidir o índice com o último número
			// outra opção: for (int i = controle -1; i>=0; i--), pois aí não precisaria diminuir controle - i -1. 
			System.out.printf("%d" + " ", inversao [i]);
		}
		scan.close();
	}
	
	public static void resoluçãoIsabella () {
		int max=100;
		int [] numeros = new int [max];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int entrada = scan.nextInt();
		int quantidade=0;
		
		for (int i=0; i<=max; i++) {
			if (entrada!=0) {
				numeros[i]=entrada;
				System.out.println("Digite mais um número: ");
				entrada = scan.nextInt();
				quantidade++; // quantidade de itens no vetor
			} else {
				break;
			}
		}
		scan.close();
		
		// o vetor tem quantidade de itens
		int [] vetorInvertido = new int [quantidade];
		
		for (int i=0; i < quantidade; i++) {
			vetorInvertido[i] = numeros[quantidade-i-1]; //se eu adiciono o zero, ainda que ele seja parada, ele entra pra soma da quantidade. O -1 vem pra tirar ele da posição do vetor.
			System.out.println(vetorInvertido[i]);
		}
		//teste de mesa
		// i=0, quantidade = 3, por exemplo
		//numero [3-0-1] = numero [2] = última posição
		//assim sucessivamente
	}
	
}
