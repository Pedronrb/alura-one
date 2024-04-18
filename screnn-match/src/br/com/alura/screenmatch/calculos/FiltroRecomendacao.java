package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificavel() >= 4){
            System.out.println("Recomandação Alta");

        }
        else if(classificavel.getClassificavel() >= 2){
            System.out.println("Recomandação Média");
        }
        else{
            System.out.println("Recomandação Baixa");
        }
    }
}
