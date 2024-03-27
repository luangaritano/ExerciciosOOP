package ExerciciosOOP;

public class IdadePessoa {
    private String nome;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int VerificaIdade(){
        if(idade < 18){
            System.out.println("Acesso inválido, idade inferior a 18 anos!");
        } else {
            System.out.println("Acesso permitido!");
        }
        return idade;
    }

}



