package aula04;

import java.util.Scanner;

public class ResoluçãoIsabella {
	public static void main(String[] args) {
		
//		exercicio01();
		exercicio02();
//		exercicio03();
	}
	
	public static void exercicio01() {
		int k = 1;
		int [] a = new int [] {1, 5, 2, 4, 10};
		int posicao = a.length+1;
		
		for (int i = 0; i<a.length; i++) {
			if (a[i] == k){
				posicao = i;
				break;
			}
		}
		
		if (posicao == a.length+1) {
			System.out.printf("Elemento K não encontrado");
		}else {
			System.out.print("O elemento K encontra-se na posição " + posicao);
		}	
	}
	
	public static void exercicio02(){
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
				quantidade++;
			} else {
				break;
			}
		}
		scan.close();
		
		for (int i=0; i<Math.floor(quantidade/2); i++) { //Math.floor vai decaindo os números
			int frente=numeros[i]; // frente vai ser os números de entrada armazenados
			int fim=quantidade-1-i; 
			numeros[i]=numeros[fim]; // vetor i agora vale o vetor fim
			numeros[fim]= frente;	// o vetor fim será o que está armazenado na variável frente, que é i, que por sua vez, agora vale o fim.
		}
		printarVetor(numeros, quantidade);
	}

	public static void exercicio03() {
		int max=5;
		int [] [] matriz = new int [max][max];
		int quantidade=0;

		for (int i = 0; i < max; i ++) {
			quantidade++;
			for (int j = 0; j < max; j ++) {				
				if (i>j) {
					matriz[i][j]=1;
				}else {
					matriz[i][j]=0;
				}
			}
		}
		
		printarMatrizQuadrada(matriz);
	}
		
	public static void printarVetor(int vetor[], int quantidade) {
		for (int i=0; i<quantidade; i++) {
			System.out.print(vetor[i]);
		}		
	}
	
	public static void printarMatrizQuadrada(int matriz[][]) {
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length; j++) {
				System.out.print(matriz[i][j]);
		}
		System.out.print("\n");	
		}
	}
}
