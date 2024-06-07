package org.example.dominio.injecaodependencia.acoplada.venda;

import org.example.dominio.injecaodependencia.acoplada.email.GmailService;

import java.math.BigDecimal;

public class VendaService {
    public void registrar(BigDecimal valor) {
        System.out.printf("Venda no valor de %s...\n", valor);

        //OutlookService outlookService = OutlookService();
        GmailService gmail = new GmailService();
        gmail.enviar();
    }
}
