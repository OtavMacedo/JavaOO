package br.com.alura.screenmatch.calculate;

public class FiltroRecomendacao {
    public void filtrar(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4) {
            System.out.println("Este título está entre os preferidos");
        } else if (classificavel.getClassificacao() >= 3) {
            System.out.println("Vale a pena assistir");
        } else {
            System.out.println("Não está entre os melhores");
        }
    }
}
