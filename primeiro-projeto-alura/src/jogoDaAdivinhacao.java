import java.util.Random;
import java.util.Scanner;

public class jogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int gerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas<5){
            System.out.println("Digite o valor entre 0 e 100: ");
            int numeroDigitado = entrada.nextInt();
            tentativas++;

            if(numeroDigitado == gerado){
                System.out.println("Você acertou " + numeroDigitado);
            } else if (numeroDigitado < gerado) {
                System.out.println("É um valor MAIOR!!");
            }else {
                System.out.println("É um valor MENOR!!");
            }

            if(tentativas == 5 && numeroDigitado != gerado){
                System.out.println();
                System.out.println("Não conseguiu :(, pois o número era: " + gerado);
            }
        }
    }
}
