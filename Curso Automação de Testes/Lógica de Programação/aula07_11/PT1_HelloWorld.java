package aula07_11;

import java.util.Scanner;

public class PT1_HelloWorld {

	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Digite seu nome:");
		String nome =input.next(); //nextLine || next
		
		System.out.println("Ola " + nome + "!");
		
		
		
		
		input.close();
	}
}
