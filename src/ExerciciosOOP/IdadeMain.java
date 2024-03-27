package ExerciciosOOP;

public class IdadeMain {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setIdade(17);
        pessoa.setNome("Luan");


        System.out.println("Informe sua idade: " + pessoa.getIdade());
        System.out.println("Informe seu nome: " + pessoa.getNome());

        pessoa.VerificaIdade();


    }
}
