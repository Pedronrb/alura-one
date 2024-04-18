import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
       Filme meuFilme1 = new Filme();
       meuFilme1.setNome( "Harry potter");
       meuFilme1.setAnoDeLancamento(1997);
       meuFilme1.setDuracaoMinutos(90);

       Filme meuFilme2 = new Filme();
       meuFilme2.setNome("AnãoZin");
       meuFilme2.setAnoDeLancamento(2000);
       meuFilme2.setDuracaoMinutos(120);


       meuFilme1.exibeFichaTecnica();
       meuFilme1.avalia(8);
       meuFilme1.avalia(5);
       meuFilme1.avalia(10);
       System.out.println("Total de avaliações" + meuFilme1.getTotalDeAvaliacao());

       System.out.println(meuFilme1.pegaMedia());

       Serie house = new Serie();
       house.setNome("House");
       house.setAnoDeLancamento(1995);
       house.exibeFichaTecnica();
       house.setTemporadas(10);
       house.setEpisodioPorTemporada(10);
       house.setMinutoPorEpisodio(50);

       System.out.println("Duração para maratonar: " + house.getNome() + " " + house.getDuracaoMinutos());

       CalculadoraDeTempo calc = new CalculadoraDeTempo();
       calc.inclui(meuFilme1);
       System.out.println(calc.getTempoTotal());

       calc.inclui(meuFilme2);
       System.out.println(calc.getTempoTotal());

       calc.inclui(house);
       System.out.println(calc.getTempoTotal());


       FiltroRecomendacao filtro = new FiltroRecomendacao();
       filtro.filtra(meuFilme1);

       Episodio episodio = new Episodio();
       episodio.setNumero(1);
       episodio.setSerie(house);
       episodio.setTotalVisualizacoes(300);
       filtro.filtra(episodio);

    }
}