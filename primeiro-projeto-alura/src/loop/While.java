package loop;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int qntdd = 0;

        while (nota != -1) {

            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar ");
            nota = entrada.nextDouble();
            if(nota != -1) {
                mediaAvaliacao += nota;
                qntdd++;
            }
        }
        System.out.println("Média de avaliações: " + mediaAvaliacao / qntdd);
    }
}
