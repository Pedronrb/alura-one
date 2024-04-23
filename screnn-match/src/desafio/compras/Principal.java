package desafio.compras;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = entrada.nextDouble();
        CartaoCredito cartao = new CartaoCredito(limite);

        int sair = 1;
        boolean compraRealizada = false;
        while (sair != 0) {
            System.out.println("Digite a descrição da compra:");
            String descricao = entrada.next();

            System.out.println("Digite o valor da compra: ");
            double valor = entrada.nextDouble();

            Compra compra = new Compra(descricao, valor);
            compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = entrada.nextInt();
            } else {
                System.out.println("Saldo insuficiente!!");
                sair = 0;
            }
        }

        System.out.println("**************");
        System.out.println("Compras realizadas: \n");

        for(Compra c : cartao.getCompras()){
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }

        System.out.println("\n*************");
        System.out.println("\nSaldo cartão: " + cartao.getSaldo());
    }
}
