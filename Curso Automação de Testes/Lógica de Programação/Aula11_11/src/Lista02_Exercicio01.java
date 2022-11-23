import java.util.Scanner;

public class Lista02_Exercicio01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int x = scan.nextInt();

        if (x%2 == 1){
            System.out.println("Weird");
        } else if (x%2 == 0 && x>=2 && x<=5) {
            System.out.println("Not Weird");
        } else if (x%2 == 0 && x>=6 && x<=20) {
            System.out.println("Weird");
        } else if (x%2 == 0 && x>20) {
            System.out.println("Not Weird");
        } else{
            System.out.println("Processo inválido");
        }
    scan.close();

    }
}
