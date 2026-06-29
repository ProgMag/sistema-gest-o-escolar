public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;

        if (idade > 0) {
            this.idade = idade;
        } else {
            this.idade = 1;
            System.out.println("Idade inválida. Definida como 1");
        }

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }
}
