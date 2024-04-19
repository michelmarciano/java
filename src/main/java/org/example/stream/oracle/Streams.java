package org.example.stream.oracle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("um");
        items.add("dois");
        items.add("três");


        Stream<String> streams = items.stream();
    }
}
