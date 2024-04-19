package org.example.injecaodependencia.naoacoplada.teste;

import org.example.injecaodependencia.naoacoplada.email.IEmailService;

public class EmailServiceMock implements IEmailService {
    @Override
    public void enviar() {
        System.out.println("Enviando mock");
    }
}
