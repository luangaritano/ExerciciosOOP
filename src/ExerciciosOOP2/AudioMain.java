package ExerciciosOOP2;

import br.com.alura.screenmatch.calculo.CalculadoraAudio;

import java.util.ArrayList;

public class AudioMain {
    public static void main(String[] args) {
        System.out.println("");
        Audio musica = new Audio("Ritmo Ritual e Responsa",2005);
        musica.setArtista("Charlie Brown JR.");
        musica.calculeIdadeDisco();
        musica.setAvalicao(10);
        musica.setAvalicao(8);
        musica.setAvalicao(7);
        musica.setTotalVisualizacoes(300);
        musica.ficha();

        FiltroRecomendacao filtroMusica = new FiltroRecomendacao();
        filtroMusica.filtra2(musica);
        System.out.println("");

        Audio musica2 = new Audio("Camisa 10 joga bola até na chuva",2007);

        musica2.setArtista("Charlie Brown JR.");
        musica2.calculeIdadeDisco();
        musica2.setAvalicao(7);
        musica2.setAvalicao(6);
        musica2.setAvalicao(5);
        musica2.setTotalVisualizacoes(200);
        musica2.ficha();
        System.out.println("");



        Audio musica3 = new Audio("Bocas Ordinárias", 2008);
        musica3.setArtista("Charlie Brown JR.");

//Exercício array -> criando lista, organizando Foreach,

        ArrayList<Audio> lista = new ArrayList<>();

        lista.add(musica);
        lista.add(musica2);
        lista.add(musica3);

        for (Audio item: lista) {
            System.out.println(item);

        }
        //System.out.println("Tamanho da lista: " + lista.size());
        //System.out.println(lista);
        System.out.println("");


// Modelo PODCAST

        Podcast podcast = new Podcast("Flow Podcast",2018);

        podcast.setApresentador("Igor 3k");
        podcast.setArtista("Luiz Felipe Pondé");
        podcast.setDuracaoEpisodio(120);
        podcast.setAvalicao(8);
        podcast.setAvalicao(10);
        podcast.setAvalicao(6);
        podcast.getClassificavel();
        podcast.ficha();

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(podcast);
        System.out.println("");



        Podcast podcast2 = new Podcast("Podpah", 2020);
        podcast2.setApresentador("Igão e Mítico");
        podcast2.setArtista("Diogo defante");
        podcast2.setDuracaoEpisodio(180);
        podcast2.setAvalicao(10);
        podcast2.setAvalicao(9);
        podcast2.setAvalicao(10);
        podcast2.ficha();
        filtro.filtra(podcast2);


        CalculadoraAudio calculadora = new CalculadoraAudio();
        calculadora.inclui(podcast);
        calculadora.inclui(podcast2);
        System.out.println("Tempo total da coletânia dos melhores episódios para maratonar: " +
                calculadora.getTempoTotal() + " minutos");





    }
}
