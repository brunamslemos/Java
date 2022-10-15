package aula03;

import java.util.Scanner;

public class Aula03 {
	
	public static void main (String [] args) {
	
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Qual o consumo mensal?");
		
		
		int consumoMensal = scan.nextInt();
		
		//Se a expressão for verdadeira, o valor retornado para consumoReal vai ser consumoMensal -1, se não, vai retornar só o consumoMensal
		int consumoReal = consumoMensal > 10 ? consumoMensal - 1 : consumoMensal;
		System.out.println(consumoReal);
		scan.close();
		}
		
		
		
		
}
