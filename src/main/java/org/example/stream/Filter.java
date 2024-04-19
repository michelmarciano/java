package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String[] args) {
        List<Integer> marcas = Arrays.asList(1,10,10,4,5,68, 68);

        long count = marcas.stream()
                .distinct()
                .count();

        System.out.println(count);
    }
}
