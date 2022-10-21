package aula05;

public class Substituição {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		a = a + b; // a passa a valer 13
		b = a - b; // b passa a valer 7
		a = a - b; 
	}
}
