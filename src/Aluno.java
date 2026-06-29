import java.util.ArrayList;

public class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    ArrayList<Double> notas = new ArrayList<>();

    public Aluno(String nome, String cpf, int idade, String matricula, String curso, ArrayList<Double> notas) {
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.curso = curso;
        this.notas = notas;
    }
}
