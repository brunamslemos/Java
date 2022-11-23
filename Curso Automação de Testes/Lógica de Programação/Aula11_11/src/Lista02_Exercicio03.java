import java.util.Scanner;

public class Lista02_Exercicio03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("De quantas notas deseja calcular a média?");
        int numeroNotas = scan.nextInt();

        double soma = 0;
        int cont = 0;


        do{
            System.out.println("Digite uma nota");
            double nota = scan.nextDouble();

            if(nota >= 0){
                soma = nota + soma;
                cont++;

            }
        }while(cont < numeroNotas);

        System.out.println("A média é: " + (soma/numeroNotas));

        scan.close();
    }


}
