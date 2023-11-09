package io.github.lucianodacunha.aula02;


public class Principal {
    public static void main(String[] args){
        Pessoa p = new Pessoa("Fulano");
        System.out.println(p.getNome());
    }
}


class Pessoa {
    private String nome;

    Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}