
package com.mycompany.butecolgbti;

public class Alimentos extends Produtos{
    
        private String comidas;
        private String bebidas;

    public Alimentos(String comidas, String bebidas, String nome, double preco) {
        super(nome, preco);
        this.comidas = comidas;
        this.bebidas = bebidas;
    }

    public String getComidas() {
        return comidas;
    }

    public String getBebidas() {
        return bebidas;
    }

    public void setComidas(String comidas) {
        this.comidas = comidas;
    }

    public void setBebidas(String bebidas) {
        this.bebidas = bebidas;
    }
        
        
    @Override
    public double getPreco() {
        return super.getPreco(); 
    }

    @Override
    public String getNome() {
        return super.getNome(); 
    }
    
    @Override
    public void setPreco(double preco) {
        super.setPreco(preco); 
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); 
    }


        
        
}
