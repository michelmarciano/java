package org.example.dominio.injecaodependencia.naoacoplada.teste;

import org.example.dominio.injecaodependencia.naoacoplada.email.IEmailService;

public class EmailServiceMock implements IEmailService {
    @Override
    public void enviar() {
        System.out.println("Enviando mock");
    }
}
