
package com.mycompany.butecolgbti;

import java.sql.Connection;

public class Cliente {
    private String nome;
    private  int idade;
    private int identidade;
    private int telefone;

    public Cliente(String nome, int idade, int identidade, int telefone) {
        this.nome = nome;
        this.idade = idade;
        this.identidade = identidade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getIdentidade() {
        return identidade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
}
