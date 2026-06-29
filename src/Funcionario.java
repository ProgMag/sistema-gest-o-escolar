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
}
