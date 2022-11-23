import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo! Primeiro, digite sua idade");
        int idade = input.nextInt();
        input.nextLine();


        if (idade >= 18){
            System.out.println("Pode entrar");
        }else{
            System.out.println("Não pode entrar ainda");
            if (idade >= 16){
                System.out.println("Está acompanhado? (Sim ou Não)");
                String acompanhamento = input.nextLine();
                if (acompanhamento.equals("Sim")){
                    System.out.println("Pode entrar");
                }else{
                    System.out.println("Você não pode entrar");
                }

                return;
            }
        }
        input.close();
    }
}

