package exercíciosClass;

import java.util.Scanner;

public class QuestaoTriangulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linhas que o triângulo deve ter: ");
		int linhas = scan.nextInt();
		
		for (int cont = linhas; cont>=0; cont--) {
			for (int a = cont; a>=0; a--) {
			System.out.printf("*");
			}
		System.out.println("");
		
		}
		
		scan.close();
	}
}
