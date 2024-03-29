package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculate.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)getMediaAvaliacoes()/2;
    }
}