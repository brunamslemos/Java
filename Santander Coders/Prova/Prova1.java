package prova;

import java.util.Scanner;

public class Prova1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da pirâmide que deseja : ");
		int tamanho = scan.nextInt();
		
		for (int i = 1; i <= tamanho; i++) {
			
			for (int j = 1; j <= tamanho - i; j++) {
				System.out.print("-");
			}
			for (int hashtag = 1; hashtag <=(i*2)-1; hashtag++) {
				System.out.print("#");
			}
			for (int j = 1; j <= tamanho - i; j++) {
				System.out.print("-");
			}
			System.out.println();
	
		}
		scan.close();
		
	}
}