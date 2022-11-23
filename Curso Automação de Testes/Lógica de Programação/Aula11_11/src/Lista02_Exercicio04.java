import java.util.Scanner;

public class Lista02_Exercicio04 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o número: ");
        int numero = scan.nextInt();

        int i = 1;

        for(i = 1; 1 <= i && i <= 10; i++){
            int multiplicacao = numero * i;
            System.out.println(numero + "x" + i + "=" + multiplicacao);
        }
        scan.close();
    }
}
