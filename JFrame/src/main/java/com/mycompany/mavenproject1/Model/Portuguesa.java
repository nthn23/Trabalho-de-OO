//Autores:Luana Lauschner Avilez Vilarinho (202265062AC),Nathan Ferreira da Silva Zoffoli (201865191AC)
package com.mycompany.mavenproject1.Model;

public class Portuguesa extends Produto{
    public Portuguesa(int valor){
        super(valor);
    }

    @Override
    public String setIngredientes() {
        String ingredientes;
        return this.ingredientes = "Molho de tomate, mussarela, preseunto, cebola, tomate, ovo cozido, oregano e azeitona";
        
    }

    @Override
    public String setNome() {
        String nome;
        return this.nome = "Portuguesa";
        
    }
}
