package org.example.dominio.injecaodependencia.naoacoplada.email;

public class GoogleEmailService implements IEmailService{
    @Override
    public void enviar() {
        System.out.println("Enviando email do Google");
    }
}
