package aula04;

public class ExercícioAula04 {
	public static void main (String[] args) {
		int k = 3;
				
		int [] a = {1,2,3,4,5};
		int pos = -1;
		
		for (int i = 0; i < a.length; i++) {
			if (k == a[i]) {
				pos = i;				
				break;
			}
		}
		if (pos >= 0) {
			System.out.println("Valor encontrado na posição: " + pos);
		}else {
			System.out.println("Valor não encontrado");
		}
	
	}
	
}
