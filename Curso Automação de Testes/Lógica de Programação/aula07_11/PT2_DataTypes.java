package aula07_11;

public class PT2_DataTypes {

		public static void main(String[] args) {
			
			/**
			 * 
			 * JAVA é uma linguagem fortemente tipada, ou seja,
			 * as variáveis precisam ter um valor definido na sua criação
			 * 
			 */
			
			// 8 tipos primitivos
			
			
			// 4 inteiros
			byte numByte = 1; // 1 byte | - 128 a 127
			short numShort = 1;	// 2 bytes | -32.768 a 32.767	
			int numInt = 10; // 4 bytes | -2.147.438.648 a 2.147.483.647
			long numLong = 100L; // 8 bytes Z -9.223.372.036.854.775.808 a 9.223.372.036.854.775.808
			
			// 2 Ponto flutuante
			float numFloat = 2.0f; // 4 bytes | 6-7 digitos decimais significativos
			double numDouble = 2.0; // 8 bytes | 15 digitos decimais significativos
			
			// Para dinheiro devemos utilizar o BigDecimal
			
			// Outros
			char letra = 'a'; // aspas simples são para caracteres
			boolean eMaiorDeIdade = true;
			
			
			
			// ------------------------------------------------------------------------------------------------
			
			String text = "Hello World";// \" para colocar aspas dentro de um texto
			
			// final mostra que não é variável e sim constante.
			
			// ------------------------------------------------------------------------------------------------
			
			//CamelCase : numeroDeEscolas para variáveis
			// SnakeCase: QUANTIDADE_TENTATIVAS para constantes
		}
}
