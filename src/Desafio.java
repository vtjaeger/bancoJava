import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String nome = "Vinicius";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("***********************\n");
        System.out.printf("Nome do cliente: %s%n", nome);
        System.out.printf("Tipo de conta: %s%n", tipoConta);
        System.out.printf("Saldo atual: R$%.2f%n", saldo);
        System.out.println("\n***********************\n");

        int opcao = 0;
        String menu = "** Digite sua opcao ** \n1 - Consultar saldo \n2 - Transferir valor \n3 - Receber valor \n4 - Sair\n";


        while(opcao != 4 ){
            System.out.println(menu);
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    System.out.printf("Saldo atualizado: R$%.2f%n\n" , saldo);
                    break;
                case 2:
                    System.out.println("Qual valor deseja transferir:");
                    double valor = scanner.nextDouble();
                    if(valor > saldo) {
                        System.out.println("Saldo insfuficiente.\n");
                    } else {
                        saldo -= valor;
                        System.out.printf("Transferencia realizada, saldo atualizado: R$%.2f%n\n", saldo);
                    }
                    break;
                case 3:
                    System.out.printf("Valor recebido\n");
                    double valorRecebido = scanner.nextDouble();
                    saldo += valorRecebido;
                    System.out.printf("Transferencia realizada, saldo atualizado: R$%.2f%n\n", saldo);
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
    }
}
