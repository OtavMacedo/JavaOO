package br.com.alura.screenmatch.calculate;
import br.com.alura.screenmatch.models.Titulo;

public class CalculaTempo {
    private int tempoTotal;
    public int getTempoTotal(){
        return tempoTotal;
    }
    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
