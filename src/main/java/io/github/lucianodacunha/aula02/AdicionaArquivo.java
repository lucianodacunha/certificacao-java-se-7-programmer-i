package io.github.lucianodacunha.aula02;


import java.util.*;
import java.io.*;

class D {
    public static void main(String[] a){
        List<String> lista = new ArrayList<>();

        for (String arg : a){
            if (new E().existe(arg)){
                lista.add(arg);

            }
        }

    }
}

class E {
    public boolean existe(String nome){
        File f = new File(nome);
        return f.exists();
    }
}
