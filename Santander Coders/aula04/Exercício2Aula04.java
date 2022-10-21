package aula04;

import java.util.Scanner;

public class Exercício2Aula04 {

	public static void main (String[] args) {
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
}
