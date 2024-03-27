package ExerciciosOOP;

public class ProdutoMain {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Amaciante OMO");
        produto1.setPreco(21.99);


        System.out.println(produto1.getNome());
        System.out.println(produto1.getPreco());

        produto1.AplicarDesconto(15);

        System.out.println("Valor total com desconto " + produto1.getPreco());

    }
}
