package org.example.dominio.injecaodependencia.naoacoplada.email;

public class OutlookEmailService implements IEmailService{
    @Override
    public void enviar() {
        System.out.println("Enviando email da Microsoft");
    }
}
