//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

        System.out.println("Esse e o Screen match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano;
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento" + anoDeLancamento);
        boolean incluindoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top gun
                Filme de aventura com gal[a dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);

    }
}