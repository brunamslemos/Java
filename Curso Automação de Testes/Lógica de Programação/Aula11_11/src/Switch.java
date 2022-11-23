import java.util.Scanner;

public class Switch {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a operação (soma, sub, mult, div)");
        String op = scan.nextLine();

        System.out.println("Digite o primeiro número");
        int num1 = scan.nextInt();

        scan.nextLine();

        System.out.println("Digite o segundo número");
        int num2 = scan.nextInt();

        switch (op) {
            case "soma":
                System.out.println("Soma: " + (num1 + num2));
                break;
            case "sub":
                System.out.println("Subtração: " + (num1 - num2));
                break;
            case "mult":
                System.out.println("Multiplicação: " + (num1 * num2));
                break;
            case "div":
                System.out.println("Divisão: " + (num1 / num2));
                break;
            default:
                System.out.println("Erro");
                break;
        }
    scan.close();
    }
}
