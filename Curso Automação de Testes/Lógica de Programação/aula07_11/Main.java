package aula07_11;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		
		//System.out.print("Hello, World! \n");
		//System.out.println("Hello, World!");
		//System.out.printf("Tenho %d anos \n", 15);
		//System.out.printf("Tenho %d anos \n", 31/2);
		//System.out.printf("Tenho %f anos \n", 15.5);
		//System.out.printf("Me chamo %s, tenho %d anos \n", "Bruna", 25);
		//System.out.println("Me chamo" + "Bruna" + ", tenho" + 25+ "anos");
		
		/**
		 * 
		 * %d - inteiros
		 * %f - numeros de ponto flutuante
		 * %b - boolean
		 * %c - char
		 * %s - string
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Digite seu nome:");
		String nome =input.next(); //nextLine || next
		
		System.out.println("Ola " + nome + "!");
		
		
		
		
		input.close();
	}
}
