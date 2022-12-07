
package com.mycompany.butecolgbti;

public class Funcionario {
    private String nome;
    private double salario;
    private int idade;
    private String funcao;
    private String curriculo;

    public Funcionario(String nome, double salario, int idade, String funcao, String curriculo) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.funcao = funcao;
        this.curriculo = curriculo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }
    
    
}
