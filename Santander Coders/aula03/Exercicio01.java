package aula03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Digite a coordenada x:");
		float x = scan.nextFloat();
		
		System.out.println ("Digite a coordenada y:");
		float y = scan.nextFloat();
		
		if (x > 0 && y > 0) {
			System.out.println("O ponto pertence ao quadrante B");
		} else if (x > 0 && y < 0){
			System.out.println("O ponto pertence ao quadrante C");
		} else if (x < 0 && y > 0) {
			System.out.println("O ponto pertence ao quadrante A");
		} else if(x < 0 && y < 0) {
			System.out.println("O ponto pertence ao quadrante D");
		} else {
			System.out.println("No eixo");
		}
			

	}

}
