# 🏫 Sistema de Gestão Escolar
> Projeto final do tema **Herança** — Curso de Java Orientado a Objetos

---

## 📋 Sobre o Projeto

Sistema de gestão escolar desenvolvido em Java para demonstrar na prática os conceitos de **Herança**, **Encapsulamento** e **Polimorfismo**. O sistema modela três tipos de pessoas de uma instituição de ensino — alunos, professores e funcionários — compartilhando uma hierarquia de classes bem definida.

---

## 🏗️ Estrutura de Classes

```
Pessoa  (superclasse)
├── Aluno
├── Professor
└── Funcionario
```

### `Pessoa` — Superclasse
Representa qualquer pessoa cadastrada na instituição.

| Atributo | Tipo | Descrição |
|---|---|---|
| `nome` | `String` | Nome completo |
| `cpf` | `String` | CPF no formato `000.000.000-00` |
| `idade` | `int` | Idade em anos (validada: deve ser > 0) |

**Métodos:**
- `exibirPerfil()` — exibe os dados básicos da pessoa
- `toString()` — retorna nome e CPF para identificação rápida do objeto

---

### `Aluno extends Pessoa`
Representa um estudante matriculado em um curso.

| Atributo | Tipo | Descrição |
|---|---|---|
| `matricula` | `String` | Código de matrícula |
| `curso` | `String` | Nome do curso |
| `notas` | `ArrayList<Double>` | Lista de notas do aluno |

**Métodos:**
- `adicionarNota(double nota)` — adiciona nota validada (0 a 10)
- `calcularMedia()` — retorna a média aritmética das notas
- `getSituacao()` — retorna a situação acadêmica:
  - `APROVADO` → média ≥ 7,0
  - `RECUPERAÇÃO` → média ≥ 5,0
  - `REPROVADO` → média < 5,0
- `exibirPerfil()` — exibe perfil completo com curso, matrícula, média e situação

---

### `Professor extends Pessoa`
Representa um docente da instituição.

| Atributo | Tipo | Descrição |
|---|---|---|
| `especialidade` | `String` | Área de especialização |
| `salario` | `double` | Salário atual |

**Métodos:**
- `aplicarReajuste(double percentual)` — aplica aumento salarial (rejeita percentual ≤ 0)
- `exibirPerfil()` — exibe perfil completo com especialidade e salário

---

### `Funcionario extends Pessoa`
Representa um funcionário administrativo da escola.

| Atributo | Tipo | Descrição |
|---|---|---|
| `setor` | `String` | Setor de atuação |
| `salario` | `double` | Salário base |
| `horasExtras` | `int` | Quantidade de horas extras no mês |

**Métodos:**
- `calcularSalarioFinal()` — retorna `salario + (horasExtras × R$ 25,00)`
- `exibirPerfil()` — exibe perfil completo com setor e salário final calculado

---

## 💡 Conceitos de OO Demonstrados

### Herança
Todas as subclasses reutilizam os atributos e métodos de `Pessoa` sem reescrever código:
```java
public class Aluno extends Pessoa {
    public Aluno(String nome, String cpf, int idade, String matricula, String curso) {
        super(nome, cpf, idade); // chama o construtor da superclasse
        // ...
    }
}
```

### Sobrescrita (`@Override`)
Cada subclasse sobrescreve `exibirPerfil()` aproveitando a implementação da mãe via `super`:
```java
@Override
public void exibirPerfil() {
    super.exibirPerfil(); // reaproveta o que Pessoa já exibe
    // adiciona informações específicas da subclasse
}
```

### Polimorfismo
Uma `ArrayList<Pessoa>` armazena objetos de tipos diferentes e chama o método correto de cada um:
```java
ArrayList<Pessoa> pessoas = new ArrayList<>();
pessoas.add(professor);
pessoas.add(funcionario);
pessoas.add(aluno);

for (Pessoa pessoa : pessoas) {
    pessoa.exibirPerfil(); // Java chama o método do objeto real!
}
```

---

## 🚀 Como Executar

### Pré-requisitos
- Java 21 ou superior
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)

### Estrutura de arquivos
```
src/
├── Main.java
├── Pessoa.java
├── Aluno.java
├── Professor.java
└── Funcionario.java
```

### Executando
```bash
# Compilar
javac src/*.java -d out/

# Executar
java -cp out/ Main
```

---

## 📊 Exemplo de Saída

```
Nome: Guilherme
CPF: 123.456.789-87
Idade: 22
Curso: ADS
Matricula: 1456987
Média: 9,17
Situação: APROVADO

✅ Reajuste de 10.0% aplicado. Novo salário: R$ 9.350,00

Nome: Rebeca
CPF: 789.145.236-07
Idade: 45
Especialidade: Computação Quântica
Salário: R$ 9.350,00

Nome: Ricardo
CPF: 753.951.874-10
Idade: 63
Setor: Auxiliar Administrativo
Salário final: R$ 4.687,00
```

---

## 📚 Contexto de Aprendizado

Este projeto foi desenvolvido como parte de um curso estruturado de Java com foco em Orientação a Objetos. Os temas estudados até este ponto foram:

- ✅ API Java (Java Standard API)
- ✅ Classes e Objetos
- ✅ Construtores e Encapsulamento
- ✅ **Herança** ← projeto atual
- ⏳ Classes Abstratas e Interfaces
- ⏳ Polimorfismo

---

## 👨‍💻 Autor

Desenvolvido por **Guilherme** como projeto prático do módulo de Herança.


👨‍💻 Autor

Desenvolvido por Guilherme como projeto prático do módulo de Herança.
