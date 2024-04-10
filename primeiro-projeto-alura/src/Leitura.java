import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito: ");
        String filme = entrada.nextLine();

        System.out.println("Ano de criação? ");
        int anoDeLancamento = entrada.nextInt();

        System.out.println("Avaliação?");
        Double nota = entrada.nextDouble();


        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(nota);

        entrada.close();
    }
}
