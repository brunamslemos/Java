import java.util.Objects;
import java.util.Scanner;

public class Lista02_Exercicio02 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a operação");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Resto");
        System.out.println("6 - Raiz");
        System.out.println("7 - Potência");


        int op = scan.nextInt();

        System.out.println("Digite o primeiro número");
        double num1 = scan.nextDouble();

        scan.nextLine();

        System.out.println("Digite o segundo número");
        double num2 = scan.nextDouble();

        if (op == 4 && num2 == 0) {
            System.out.println("Não é possível realizar divisão por zero");
            return;
        }

        switch (op) {
            case 1:
                System.out.println("Soma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplicação: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Divisão: " + (num1 / num2));
                break;
            case 5:
                System.out.println("Resto: " + (num1%num2));
                break;
            case 6:
                System.out.println("A raiz do primeiro número é: " + (Math.sqrt(num1) + "\nA raiz do segundo número é: " + (Math.sqrt(num2))));
                break;
            case 7:
                System.out.println("A potência é: " + Math.pow(num1, num2));
                break;
            default:
                System.out.println("Erro");
                break;
        }
        scan.close();
    }
}
