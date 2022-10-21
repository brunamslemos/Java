package aula01;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número!");
		double big = scan.nextDouble();
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Digite o proximo número!");
			double current = scan.nextDouble();

			if(big < current) {
				big = current;
			}
		}
		System.out.println("O maior número é: " + big);
		scan.close();
	}
}
