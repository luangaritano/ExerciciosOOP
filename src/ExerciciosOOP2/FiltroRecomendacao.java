package ExerciciosOOP2;

public class FiltroRecomendacao {

//Interface encapsulada

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificavel() >=4){
            System.out.println("Está entre os melhores do momento!");
        }

    }

    public void filtra2(Classificavel classificavel){
        if(classificavel.getClassificavel() >= 300) {
            System.out.println("Top 10 Rock Nacional");
        }
    }
}
