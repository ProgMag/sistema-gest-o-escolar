public class Professor extends Pessoa {

    private String especialidade;
    private double salario;

    public Professor(String nome, String cpf, int idade,  String especialidade,  double salario) {
        super(nome, cpf, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    void aplicarReajuste(double percentual) {
        if (percentual <= 0) {
            System.out.println("O reajuste precisa ser maior que 0");
        } else {
            this.salario += (this.salario * percentual) / 100;
            System.out.format("""
                    Reajuste realizado com sucesso!
                    Novo salário: %f
                    """, salario);
        }
    }

    @Override
    void exibirPerfil() {
        super.exibirPerfil();
        System.out.format("""
                Especialidade: %s
                Salario: %f
                """, especialidade, salario);
    }
}
