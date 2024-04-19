package org.example.stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class BuildStream {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java", "Lua", "Js");
    }
}
