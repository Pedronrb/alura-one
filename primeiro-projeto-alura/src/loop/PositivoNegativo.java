package loop;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numeroUsuario = entrada.nextInt();

        if(numeroUsuario > 0){
            System.out.println("Positivo");
        }else {
            System.out.println("Negativo");
        }
    }
}
