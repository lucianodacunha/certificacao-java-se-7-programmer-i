package main;

import model.Pessoa;
import service.*;
import static util.Math.*;
// import service.util.ServiceUtil;

// Não é permitido importar duas classes com o mesmo nome.
/**
 *  import pacote1.Classe;
 *  import pacote2.Classe;
 * 
 *  Porém, importante lembrar que não dá erro importar duas vezes a mesma classe
 *  import pacote1.Classe;
 *  import pacote1.Classe;
 */

public class Main{
    public static void main(String[] args){
        System.out.println("Java");

        Pessoa p1 = new Pessoa();
        service.Pessoa p2 = new service.Pessoa();

        int soma = sum(1, 1);
        System.out.println("Valor da soma: " + soma);

        // Math.sum(1, 1);
    }
}