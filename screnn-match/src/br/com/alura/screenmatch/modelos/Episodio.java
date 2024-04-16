package br.com.alura.screenmatch.modelos;

import br.com.alra.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {

    private int numero;
    private String nome;
    //Episódio de tal série. E a série têm seus atributos: numero e nome.
    private Serie serie;
    private int totalVisualizacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificavel() {
        if(totalVisualizacoes > 100){
            return 4;
        }
        else{
            return 2;

        }
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }
}