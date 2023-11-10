package io.github.lucianodacunha.aula03.program.controller;

import io.github.lucianodacunha.aula03.program.model.Pessoa;


import java.util.List;
import java.util.ArrayList;

public class PessoaController {

    private List<Pessoa> bd = new ArrayList<>();

    public void cadastrar(Pessoa pessoa) {
        bd.add(pessoa);
    }   

    public List<Pessoa> listarTudo(){
        return bd;
    }
}