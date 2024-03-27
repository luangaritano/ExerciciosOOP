package ExerciciosOOP.modelos;

public class ContaBancaria {
    protected double saldo;



    public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Deposito de: " + valor + " realizado com sucesso!");

    }

    public void sacar(double saque){
        this.saldo = saldo - saque;

        System.out.println("Saque de: " + saque + " realizado com sucesso!");

    }
    public void consultarSaldo(){

        System.out.println("Saldo Disponível: " + saldo);


    }


}
