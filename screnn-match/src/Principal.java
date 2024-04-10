//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
       Filme meuFilme = new Filme();
       meuFilme.nome = "Harry potter";
       meuFilme.anoDeLancamento = 1997;
       meuFilme.duracaoMinutos = 90;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);

    }
}