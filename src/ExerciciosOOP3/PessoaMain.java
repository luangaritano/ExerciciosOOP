package ExerciciosOOP3;

public class PessoaMain {
    public static void main(String[] args) {
        var pessoa = new Pessoa();
        pessoa.setNome("Luan");
        pessoa.setIdade(29);


        System.out.println(pessoa.toString());

    }
}
