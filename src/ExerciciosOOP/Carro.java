package ExerciciosOOP;

public class Carro {
    String modelo;
    String cor;
    int idade;
    int anoDeLancamento;
    int anoDeCompra;


    void fichaTecnica(){
        System.out.println(modelo);
        System.out.println(idade);
        System.out.println(cor);
    }

    double calculaIdade() {
        idade = anoDeCompra - anoDeLancamento;
        return idade;
    }

}
