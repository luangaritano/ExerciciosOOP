package ExerciciosOOP.modelos;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;


    public void definaModelo(String modelo){
        this.modelo = modelo;
    }

    public void definaPreco(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirFicha(){
        System.out.println("Modelo: "  + modelo);
        System.out.println("Preço primeiro ano " + precoAno1);
        System.out.println("Preço segundo ano " + precoAno2);
        System.out.println("Preço terceiro ano " + precoAno3);
    }

    public double exibaMenorPreco(){
        double menorPreco = precoAno1;

        if(precoAno2 < menorPreco){
            menorPreco = precoAno2;
        }
        if(precoAno3 < menorPreco){
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    public double exibaMaiorPreco(){
        double maiorPreco = precoAno1;

        if(precoAno2 > maiorPreco){
            maiorPreco = precoAno2;
        }
        if(precoAno3 > maiorPreco){
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }





}

