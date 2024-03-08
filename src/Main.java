import br.com.alura.screenmatch.calculate.CalculaTempo;
import br.com.alura.screenmatch.calculate.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Filme velozesEfuriosos = new Filme();
        velozesEfuriosos.setNome("Velozes e Furiosos");
        velozesEfuriosos.setAnoDeLancamento(2022);
        velozesEfuriosos.setDuracaoEmMinutos(240);
        velozesEfuriosos.setIncluidoNoPlano(true);

        velozesEfuriosos.exibeFichaTecnica();
        velozesEfuriosos.avalia(7);
        velozesEfuriosos.avalia(5);
        velozesEfuriosos.avalia(10);
        System.out.println("Total de avaliações: " + velozesEfuriosos.getTotalDeAvaliacoes());
        System.out.printf("Média das avaliações: %.1f",velozesEfuriosos.getMediaAvaliacoes());
        System.out.println();

        Serie lost = new Serie();
        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(5);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();
        System.out.println();

        Filme mario = new Filme();
        mario.setNome("Mario");
        mario.setAnoDeLancamento(2022);
        mario.setDuracaoEmMinutos(160);

        CalculaTempo calculaTempo = new CalculaTempo();
        calculaTempo.inclui(velozesEfuriosos);
        calculaTempo.inclui(mario);
        calculaTempo.inclui(lost);
        System.out.println(calculaTempo.getTempoTotal());

        System.out.println();
        Episodio episodio = new Episodio();
        episodio.setNome("First");
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtrar(episodio);
    }
}
