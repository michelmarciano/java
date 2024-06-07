package org.example.dominio.stream.oracle;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
            List<Pessoa> pessoas = new Pessoa().populaPessoas();
            pessoas.stream()
                    .filter(pessoa -> pessoa.getNacionalidade()
                            .equals("Brasil"))
                    .forEach(System.out::println);

    }
}
