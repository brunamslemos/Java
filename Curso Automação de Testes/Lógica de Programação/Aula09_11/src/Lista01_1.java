import java.util.Scanner;

public class Lista01_1 {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = input.nextLine();

        System.out.print("Digite sua idade");
        int idade = input.nextInt();
        input.nextLine();

        System.out.println("\nDigite sua profissão");
        String profissao = input.nextLine();

        System.out.printf ("Seu nome é %s, sua idade é %d e sua profissão é %s.", nome, idade, profissao);

    }

}
