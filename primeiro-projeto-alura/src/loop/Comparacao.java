package loop;

import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Primeiro valor: ");
        int pValor = entrada.nextInt();
        System.out.println("Segundo valor: ");
        int sValor = entrada.nextInt();

        if(pValor == sValor){
            System.out.println("São IGUAIS!!");
        } else if(pValor > sValor){
            System.out.println("Primeiro é MAIOR!!");
        } else{
            System.out.println("Segundo é MAIOR!!");
        }
    }
}
