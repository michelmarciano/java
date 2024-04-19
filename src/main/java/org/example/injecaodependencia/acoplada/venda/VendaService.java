package org.example.injecaodependencia.acoplada.venda;

import org.example.injecaodependencia.acoplada.email.GmailService;
import org.example.injecaodependencia.acoplada.email.OutlookService;

import java.math.BigDecimal;

public class VendaService {
    public void registrar(BigDecimal valor) {
        System.out.printf("Venda no valor de %s...\n", valor);

        //OutlookService outlookService = OutlookService();
        GmailService gmail = new GmailService();
        gmail.enviar();
    }
}
