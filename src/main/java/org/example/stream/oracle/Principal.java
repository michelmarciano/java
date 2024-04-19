package org.example.stream.oracle;

import java.util.List;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
            List<Pessoa> pessoas = new Pessoa().populaPessoas();
            pessoas.stream()
                    .filter(pessoa -> pessoa.getNacionalidade()
                            .equals("Brasil"))
                    .forEach(System.out::println);

    }
}
