import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo a calculadora java");

        boolean continuar = true;
        while (continuar) {
            System.out.println("digite o primeiro numero: ");
            float x = input.nextFloat();
            System.out.println("digite o segundo numero: ");
            float y = input.nextFloat();
            System.out.println("agora escolha o operador numerico:\n1 = +\n2 = -\n3 = *\n4 = /\n");

            int z = input.nextInt();
            switch (z) {
                case 1:
                    System.out.println("Seu resultado é: " + (x + y));
                    break;
                case 2:
                    System.out.println("seu resultado é: " + (x - y));
                    break;
                case 3:
                    System.out.println("seu resultado é: " + (x * y));
                    break;
                case 4:
                    if (y != 0) {
                        System.out.println("seu resultado é: " + (x / y));
                    }else{System.out.println("divisão com 0, divisão invalida");
                    }
                    break;
                default:
                    System.out.println("operação invalida");
            }
            System.out.println("deseja continuar?\n1 = sim\n2 = não");
            int resposta = input.nextInt();
            if (resposta == 2){
                continuar = false;
                System.out.println("Saindo");
            }



        }
        input.close();
    }
}