package ExerciciosOOP;
import ExerciciosOOP.modelos.ContaCorrente;
import ExerciciosOOP.modelos.ContaBancaria;




public class ContaBancariaHerançaMain {
    public static void main(String[] args) {
        ContaBancaria contaB = new ContaBancaria();

        contaB.depositar(1000);
        contaB.sacar(500);
        contaB.consultarSaldo();

        ContaCorrente contaC = new ContaCorrente();

        contaC.cobrarTarifaMensal(19.90);







    }
}
