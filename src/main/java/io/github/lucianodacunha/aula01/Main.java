package io.github.lucianodacunha.aula01;


public class Main {
    // variáveis de instância.
    int x = 3; 
    int z = 4;
    static int a = 10; // variavel static

    public Main(){
        // variável local
        int x = 1;
        int z = 2;

        System.out.println("Valor de x " + x + " valor de z: " + z);
    }

    public static void main(String[] args ){
        new Main();

        System.out.println("Valor da variável static: " + Main.a);
      
    }

}