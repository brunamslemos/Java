package exercíciosClass;

import java.util.Scanner;

public class Questão_1 {

		public static float salario;
		public static Scanner scan = new Scanner(System.in);
		
		public static void main(String[] args) {
			setSalario();
			saidaSalarioBrutoAnual();
			saidaTotalDescontoInss();
			saidaSalarioLiquidoAnual();
						
			scan.close();
		}
		
		public static void setSalario() {
			do {
				System.out.println("Digite seu salário mensal:");
				salario = scan.nextFloat();
				
				} while (salario<=0); 
					
		}
		
		public static float calcularFerias() {
			float ferias = salario / 3;

			return ferias;
		}

		public static float calcularINSS() {
			
			//0 até 1212.00 -> 7,5%.
			//1212.01 até 2427.35 -> 9%.
			//2427.36 até 3641.03 -> 12%.
			//3641.04 até 708.22 -> 14%.
			
			float aliquota1 = 0.075f;
			float aliquota2 = 0.09f;
			float aliquota3 = 0.12f;
			float aliquota4 = 0.14f;
			float aliquota5 = 900.00f;
			
			if (salario <= 1212.00) {
				float inss1 = salario * aliquota1;
				return inss1;
				
			} else if (salario <=2427.35) {
				float inss2 = salario * aliquota2;
				return inss2;
				
			} else if (salario <=3641.03) {
				float inss3 = salario * aliquota3;
				return inss3;
				
			} else if (salario <=7087.22) {
				float inss4 = salario * aliquota4;
				return inss4;
				
			} else {
				float inss5 = aliquota5;
				return inss5;
			}
		
		}
		
		public static float calculaSalarioBrutoAnual() {
			float salarioAnual = salario * 12;
			float decimoTerceiro = salario;
			float feriasFinal = calcularFerias();
			float salarioBrutoAnual = salarioAnual + decimoTerceiro + feriasFinal;
			
			return salarioBrutoAnual;
		
		}
		
		public static float calculaTotalDescontoInss() {
			float inssCalculado = calcularINSS ();
			float descontoTotalInss = inssCalculado * 13;
			
			return descontoTotalInss;
			
		}
		
		public static float calculaSalarioLiquidoAnual() {
			float salarioBrutoAnual = calculaSalarioBrutoAnual();
			float descontoTotalInss = calculaTotalDescontoInss();
			float salarioLiquidoAnual = salarioBrutoAnual - descontoTotalInss;
			
			return salarioLiquidoAnual;
			
		}
		
		public static void saidaSalarioBrutoAnual() {
			float saidaBruto = calculaSalarioBrutoAnual();
			System.out.printf("O valor do seu salario bruto anual e: R$ %.2f\n", saidaBruto);
		}
		
		public static void saidaTotalDescontoInss() {
			float saidaInss = calculaTotalDescontoInss();
			System.out.printf("O valor do desconto anual do INSS e de: R$ %.2f\n", saidaInss);
		}
		
		public static void saidaSalarioLiquidoAnual () {
			float saidaLiquido = calculaSalarioLiquidoAnual();
			System.out.printf("O valor do seu salário líquido anual e: R$ %.2f\n", saidaLiquido);
		}
}
	