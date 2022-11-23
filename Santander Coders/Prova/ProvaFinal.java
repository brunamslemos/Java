package prova;

import java.util.Random;
import java.util.Scanner;

public class ProvaFinal {

	int tamanho;
    public static void main(String[] args) {
        int[][] matriz = montarEPreencherQuadrado();
        int tamanhoMatriz = matriz.length;
        
        boolean quadradoPerfeito = true;
    	int primeiraLinha = 0;
    	int primeiraColuna = 0;
        
        for (int i=0;i<tamanhoMatriz;i++){
        	int totalLinha = 0;
        	int totalColuna = 0;
        	for (int j=0;j<tamanhoMatriz;j++){
        		if(i==0){
        			primeiraLinha+=matriz[i][j];
        			primeiraColuna+=matriz[j][i];
        		}
        		totalLinha+=matriz[i][j];
        		totalColuna+=matriz[j][i];
        	}
    		if(totalLinha!=primeiraLinha || totalLinha!=totalColuna || totalColuna!=primeiraColuna || primeiraColuna!=primeiraLinha){
    			quadradoPerfeito = false;
    		}
        }
        if(quadradoPerfeito){
        	System.out.println("E um quadrado perfeito");
        } else {
        	System.out.println("Nao e um quadrado perfeito");
        }
    }    
    
    
    public static int[][] montarEPreencherQuadrado() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do quadrado desejado:");
        int tamanho = scanner.nextInt();
        int[][] matriz = new int[tamanho][tamanho];
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] colunas = matriz[linha];
            for (int coluna = 0; coluna < colunas.length; coluna++) {
                int valorAleatorio = random.nextInt(1000);
                colunas[coluna] = valorAleatorio;
                System.out.print("[" + valorAleatorio + "]");
            }
            System.out.println();
        }
        scanner.close();
        return matriz;
    }
    
   
    
}
