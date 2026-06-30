public class Main {
    static void main() {

        Aluno aluno = new Aluno("Guilherme", "123.456.789-87", 22, "1456987", "Ads");
        aluno.adicionarNota(10);
        aluno.adicionarNota(9);
        aluno.adicionarNota(8.5);
        aluno.exibirPerfil();

        System.out.println("\n");

        Professor professor = new Professor("Rebeca", "789.145.236-07", 45, "Computação Quântica", 8500);
        professor.aplicarReajuste(10);
        professor.exibirPerfil();

        System.out.println('\n');

        Funcionario funcionario = new Funcionario("Ricardo", "753.951.874-10", 63, "Auxiliar Administrativo", 4512, 7);
        funcionario.calcularSalarioFinal();
        funcionario.exibirPerfil();
    }
}
