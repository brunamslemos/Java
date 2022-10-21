package aula04;

public class Exercicio3Aula04 {
	
	public static void main(String[] args) {
		
	int dimensao = 5;
	
	int [][] minhaMatriz = criarMatrizQuadrada(dimensao);	
	imprimir(minhaMatriz);
	
	}
	
	public static int [][] criarMatrizQuadrada (int dimensao){
		int [][] matriz = new int [dimensao] [dimensao];
		for (int l = 0; l < dimensao; l++) { //percorre as linhas
			for (int c = 0; c < dimensao; c++) { //percorre as colunas
				if (l > c) {
				matriz[l][c] = 1;
				} else {
				matriz [l][c] = 0;
				}
			}
		}
		return matriz;
	}
	
	public static void imprimir (int[][] matrix) {
		int dimensao = matrix.length;
		for (int l = 0; l < dimensao; l++) { //percorre as linhas
		for (int c = 0; c < dimensao; c++) { //percorre as colunas
			System.out.println(matrix [l][c] + " ");
			}
		}
	}
}