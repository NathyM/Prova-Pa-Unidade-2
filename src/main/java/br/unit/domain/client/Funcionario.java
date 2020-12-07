package br.unit.domain.client;



public class Funcionario {

    private Double matricula;
    private String nome;
    private Double salario;

    public Funcionario() {
    }

    public Double getMatrricula() {

        return matricula;
    }

    public void setMatricula(Double matricula) {

        this.matricula = matricula;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Double getSalario()     {
        return salario;
    }

    public void setSalario(Double salario) {

        this.salario = salario;
    }
}
