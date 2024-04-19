package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Map {

    public static void main(String[] args) {

        List<String> marcas = Arrays.asList("Bmw", "AUDI", "honda");

        marcas.stream().map(e-> e.toUpperCase()).forEach(System.out::println);
    }
}
