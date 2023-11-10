package io.github.lucianodacunha.aula03.program.model;


public class Pessoa {
    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString(){
        return this.nome;
    }
}