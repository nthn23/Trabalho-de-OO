package com.mycompany.mavenproject1.Model;

public class Mussarela extends Produto{
    public Mussarela(String nome, int valor, String ingredientes, String tamanho){
        super(nome, valor, ingredientes, tamanho);
    }

    @Override
    public void setIngredientes(String ingredientes) {
        this.ingredientes = "Molho de tomate, mussarela, tomate, oregano e azeitona";
        
    }

    @Override
    public void setNome(String nome) {
        this.nome = "Mussarela";
        
    }
}
