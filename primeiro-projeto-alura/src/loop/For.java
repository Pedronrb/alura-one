package loop;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        System.out.println("Quantos filme serão avaliados? ");
        int qntdd = entrada.nextInt();

        for (int i = 0; i < qntdd; i++) {
            System.out.println("Diga sua avaliação para o filme? ");
            nota = entrada.nextDouble();
            mediaAvaliacao = ((nota * qntdd) / qntdd);
        }
        System.out.println("Média de avaliações: " + mediaAvaliacao);
    }
}
