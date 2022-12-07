package com.mycompany.butecolgbti;

public class Atracao extends Produtos {
    private int telefone;
    private float avaliacao;
    private double caches;
    private String horario;

    public Atracao(int telefone, float avaliacao, double caches, String horario, String nome, double preco) {
        super(nome, preco);
        this.telefone = telefone;
        this.avaliacao = avaliacao;
        this.caches = caches;
        this.horario = horario;
    }

    public int getTelefone() {
        return telefone;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public double getCaches() {
        return caches;
    }

    public String getHorario() {
        return horario;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setCaches(double caches) {
        this.caches = caches;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco); 
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); 
    }

    @Override
    public double getPreco() {
        return super.getPreco(); 
    }

    @Override
    public String getNome() {
        return super.getNome(); 
    }
    
    
    
}
