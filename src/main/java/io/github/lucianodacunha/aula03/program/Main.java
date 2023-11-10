package io.github.lucianodacunha.aula03.program;

import io.github.lucianodacunha.aula03.program.controller.PessoaController;
import io.github.lucianodacunha.aula03.program.model.Pessoa;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        PessoaController controller = new PessoaController();
        controller.cadastrar(new Pessoa("Java"));
        List<Pessoa> pessoas = controller.listarTudo();

        for (Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }
        
    }
}