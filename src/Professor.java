public class Professor extends Pessoa {

    private String especialidade;
    private double salario;

    public Professor(String nome, String cpf, int idade,  String especialidade,  double salario) {
        super(nome, cpf, idade);
        this.especialidade = especialidade;
    }

    public double aplicarReajuste(double percentual) {
        if (percentual <= 0) {
            System.out.println("O reajuste precisa ser maior que 0");
        } else {
            return
        }
    }
}
