package ExerciciosOOP;
import ExerciciosOOP.modelos.Carro;
import ExerciciosOOP.modelos.ModeloCarro;


public class CarroHerançaMain {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.definaModelo("Mustang");
        carro.definaPreco(100.000,150.000,180.000);
        carro.exibirFicha();

        System.out.println(carro.exibaMenorPreco());
        System.out.println(carro.exibaMaiorPreco());

        ModeloCarro modelo2 = new ModeloCarro();
        modelo2.definaModelo("Ferrari");
        modelo2.definaPreco(300.000,450.000,600.000);
        modelo2.exibirFicha();

        System.out.println(modelo2.exibaMenorPreco());
        System.out.println(modelo2.exibaMaiorPreco());



















    }
}
