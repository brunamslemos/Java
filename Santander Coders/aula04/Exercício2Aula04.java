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
			System.out.println("Digite o número: ");
			n = scan.nextInt();
			if (n == 0) {
				break;
			}
			numeros [controle] = n;
			controle ++;
			
		}while (controle < MAX );
		scan.close();
	}
}
