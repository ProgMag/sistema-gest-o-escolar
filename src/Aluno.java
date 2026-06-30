import java.util.ArrayList;

public class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    ArrayList<Double> notas = new ArrayList<>();

    public Aluno(String nome, String cpf, int idade, String matricula, String curso) {
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    void adicionarNota(double nota) {
        if (nota >= 0 || nota <= 10) {
            notas.add(nota);
        } else {
            System.out.println("Não foi possível adicionar a nota do aluno. A nota precisa ser entre 0 e 10");
        }
    }

    public double calcularMedia() {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public String getSituacao() {
        if (calcularMedia() > 7) {
            return "APROVADO";
        } else if (calcularMedia() > 5) {
            return "RECUPERAÇÃO";
        } else {
            return "REPROVADO";
        }
    }

    @Override
    void exibirPerfil() {
        super.exibirPerfil();
        System.out.format("""
                Curso: %s
                Matricula: %S
                Média: %.2f
                Situação: %s
                """, curso, matricula, calcularMedia(), getSituacao());
    }
}
