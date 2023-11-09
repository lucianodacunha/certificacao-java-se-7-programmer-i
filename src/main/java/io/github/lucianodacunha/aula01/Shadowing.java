package io.github.lucianodacunha.aula01;

public class Shadowing {
    private String valor = "valor1";

    public String method1(String valor){
        return valor;
    }

    public String method2(String valor){
        return this.valor;
    }    

    public static void main(String[] args){
        Shadowing s = new Shadowing();

        System.out.println("Valor de s.method1: " + s.method1("valor2"));
        System.out.println("Valor de s.method2: " + s.method2("valor3"));

    }
}