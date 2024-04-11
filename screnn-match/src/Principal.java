import br.com.alura.screenmatch.modelos.Filme;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
       Filme meuFilme = new Filme();
        meuFilme.setNome( "Harry potter");
        meuFilme.setAnoDeLancamento(1997);
        meuFilme.setDuracaoMinutos(90);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações" + meuFilme.getTotalDeAvaliacao());

        System.out.println(meuFilme.pegaMedia());


    }
}