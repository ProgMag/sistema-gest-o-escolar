public class Funcionario extends Pessoa{

    private String setor;
    private double salario;
    private int horasExtras;


    public Funcionario(String nome, String cpf, int idade, String setor, double salario, int horasExtras) {
        super(nome, cpf, idade);
        this.setor = setor;
        this.salario = salario;
        this.horasExtras = horasExtras;
    }

    public double calcularSalarioFinal() {
        return this.salario += horasExtras * 25;
    }

    @Override
    void exibirPerfil() {
        super.exibirPerfil();
        System.out.format("""
                Setor: %s
                Salário final: %f
                """, setor, salario);
    }
}
