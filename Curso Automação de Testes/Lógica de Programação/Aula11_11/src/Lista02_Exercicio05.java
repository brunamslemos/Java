import java.util.Scanner;

public class Lista02_Exercicio05 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num;
        int fat = 1;

        System.out.println("Digite o número que deseja calcular o fatorial: ");
        num = scan.nextInt();

        for(int i = 1;i <= num; i++){
                fat = fat * i;
        }
            System.out.println(num + "!" + " = " + fat);

        scan.close();
    }
}
