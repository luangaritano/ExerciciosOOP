package ExerciciosOOP;

public class Aluno2Main {
    public static void main(String[] args) {
        Aluno2 aluno = new Aluno2();
        aluno.setNome("Henrique");
        aluno.setNotas1(10);
        aluno.setNotas2(2);
        aluno.setNotas3(8);

        System.out.println("Nota primeiro bimestre: " + aluno.getNotas1());
        System.out.println("Nota segundo bimestre: " + aluno.getNotas2());
        System.out.println("Nota terceiro bimestre: " + aluno.getNotas3());

        System.out.println("Média total: " + aluno.calcularMedia());


    }
}
