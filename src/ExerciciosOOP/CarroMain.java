package ExerciciosOOP;

public class CarroMain {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Mustang";
        meuCarro.cor = "Vermelho";
        meuCarro.anoDeLancamento = 1980;
        meuCarro.anoDeCompra = 2024;

        meuCarro.fichaTecnica();
        System.out.println(meuCarro.calculaIdade());
    }
}
