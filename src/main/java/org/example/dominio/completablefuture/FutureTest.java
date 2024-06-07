package org.example.dominio.completablefuture;

import java.util.concurrent.CompletableFuture;

public class FutureTest {

    public void getExecuteFuture() {

        CompletableFuture.runAsync(() -> {
            System.out.println("Rodando ");
        });
    }
}
