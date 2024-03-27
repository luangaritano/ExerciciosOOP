package ExerciciosOOP.modelos;

public class ConversorMoeda implements ConversaoFinanceira {
    double cotacao = 4.93;


    @Override
    public void converterDolarParaReal(double dolar) {
        this.cotacao = cotacao * dolar;
        System.out.println(cotacao);
    }
}
