package org.example.injecaodependencia.naoacoplada.email;

public class MockEmailService implements IEmailService{
    @Override
    public void enviar() {
        System.out.println("Enviando email Mockado");
    }
}
