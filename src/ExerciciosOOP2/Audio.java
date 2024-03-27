package ExerciciosOOP2;

   public  class Audio implements Classificavel {
      private String titulo;
      private String artista;
      private int anoLancamento;
      private int avaliacao;
      private int numAvaliacoes;
      private int idadeDisco;

      public int getTotalVisualizacoes() {
         return totalVisualizacoes;
      }

      public void setTotalVisualizacoes(int totalVisualizacoes) {
         this.totalVisualizacoes = totalVisualizacoes;
      }

      private int totalVisualizacoes;


      public Audio(String titulo, int anoLancamento) {
         this.titulo = titulo;
         this.anoLancamento = anoLancamento;
      }

      public int calculeIdadeDisco() {
         this.idadeDisco = 2024 - anoLancamento;
         return idadeDisco;
      }

      public void setAvalicao(int nota) {
         this.avaliacao = avaliacao + nota;
         numAvaliacoes++;
      }

      public int getMedia() {

         return avaliacao / numAvaliacoes;

      }

      public void ficha() {
         System.out.println("Artista: " + getArtista());
         System.out.println("Album: " + getTitulo());
         System.out.println("Ano de lançamento: " + getAnoLancamento());
         System.out.println("Tempo de lançado: " + calculeIdadeDisco() + " anos");
         System.out.println("Total de visualizações: " + getTotalVisualizacoes());
         System.out.println("Quantidade de avaliações: " + getNumAvaliacoes());
         System.out.println("Soma das notas de avaliação: " + getAvalicao());
         System.out.println("Média total das avaliações: " + getMedia());
      }

      public String getTitulo() {
         return titulo;
      }

      public String getArtista() {
         return artista;
      }

      public void setArtista(String artista) {
         this.artista = artista;
      }

      public int getAnoLancamento() {
         return anoLancamento;
      }


      public int getAvalicao() {
         return avaliacao;
      }

      public int getNumAvaliacoes() {
         return numAvaliacoes;
      }

      @Override
      public String toString() {
         return "Musica{" +
                 "titulo='" + this.getTitulo() + '\'' +
                 ", artista='" + this.getArtista() + '\'' +
                 ", anoLancamento=" + this.getAnoLancamento() +
                 ", avaliacao=" + this.getAvalicao() +
                 ", numAvaliacoes=" + this.getNumAvaliacoes() +
                 '}';
      }


      @Override
      public int getClassificavel() {
         return getTotalVisualizacoes();
      }
   }
