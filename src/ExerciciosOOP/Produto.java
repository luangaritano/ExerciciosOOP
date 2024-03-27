package ExerciciosOOP;

public class Produto {
    private String nome;
    private double precoProduto;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return precoProduto;
    }

    public void setPreco(double preco) {
        this.precoProduto = preco;
    }


    public void AplicarDesconto(double porcentagem){
        double desconto = precoProduto * (porcentagem / 100);
        precoProduto = precoProduto - desconto;






        ;
    }
}
