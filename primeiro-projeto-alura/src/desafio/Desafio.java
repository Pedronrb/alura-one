package desafio;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = "Pedro N.";
        String tipoConta = "Poupança";
        double saldo = 1999.00;
        int opcao = 0;

        System.out.println("**********");
        System.out.println("\nNome do cliente: "+ nome);
        System.out.println("\nTipo da conta: " + tipoConta);
        System.out.println("\nSaldo atual: "+ saldo);
        System.out.println("\n**********");

        String menu = """
                ** Digite opção ***
                1 - Consultar saldo:
                2 - Transferir:
                3 - Receber valor:
                4 - Sair:
                Qual a opção desejada ?
                """;

        while(opcao != 4){
            System.out.println(menu);
            opcao = entrada.nextInt();

            if(opcao == 1){
                System.out.println("O saldo é:" + saldo + "\n");
            } else if (opcao == 2) {
                System.out.println("Qual valor a transferir? " + "\n");
                double valorTrans = entrada.nextDouble();

                if(valorTrans > saldo){
                    System.out.println("Saldo insuficiente!!" + "\n");
                }else {
                    saldo -= valorTrans;
                    System.out.println("O novo saldo é: " + saldo + "\n");
                }
            }
            else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = entrada.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo é: " + saldo);
            }
            else if(opcao != 4){
                System.out.println("Opação inválida!!");
            }
        }
        System.out.println("Operação finalizada!!");
    }
}
