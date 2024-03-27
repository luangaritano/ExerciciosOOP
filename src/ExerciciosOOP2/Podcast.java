package ExerciciosOOP2;

public class Podcast extends Audio implements Classificavel{
    private int duracaoEpisodio;
    private String apresentador;


    public Podcast(String titulo, int anoLancamento) {
        super(titulo,anoLancamento);
    }

    public int getDuracaoEpisodio() {
        return duracaoEpisodio;
    }

    public void setDuracaoEpisodio(int duracaoEpisodio) {
        this.duracaoEpisodio = duracaoEpisodio;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

//Sobrescrita de método

    @Override
    public void ficha() {
        System.out.println("Apresentador : " + getApresentador());
        System.out.println("Plataforma : " + getTitulo());
        System.out.println("Convidado: " + getArtista());
        System.out.println("Tempo de lançado: " + calculeIdadeDisco() + " anos");
        System.out.println("Duração do episódio: " + getDuracaoEpisodio() + " minutos");
        System.out.println("Média de avaliações: " + getMedia());
        System.out.println("Total de estrelas: " + getClassificavel());
    }

//Interface

    @Override
    public int getClassificavel() {
        return getMedia() / 2;

    }
}
