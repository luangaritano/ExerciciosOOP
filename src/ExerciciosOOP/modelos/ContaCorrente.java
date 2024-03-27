package ExerciciosOOP.modelos;

public class ContaCorrente extends ContaBancaria{
    double tarifaMensal;


    public void cobrarTarifaMensal(double tarifa){
        this.saldo = saldo - tarifa;

        System.out.println("Saldo atualizado após desconto da tarifa mensal: " + saldo);

        }
    }

