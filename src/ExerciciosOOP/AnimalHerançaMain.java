package ExerciciosOOP;


import ExerciciosOOP.modelos.Animal;
import ExerciciosOOP.modelos.Cachorro;
import ExerciciosOOP.modelos.Gato;

public class AnimalHerançaMain {
    public static void main(String[] args) {
       Animal animal = new Animal();
       animal.emitirSom();


       Cachorro cachorro = new Cachorro();
       cachorro.emitirSom();
       cachorro.abanarRabo();

       Gato gato = new Gato();
       gato.emitirSom();
       gato.arranharMoveis();


    }
}
