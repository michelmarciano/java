package org.example.injecaodependencia.naoacoplada.venda;

import org.example.injecaodependencia.naoacoplada.email.IEmailService;

import java.math.BigDecimal;

public class VendaService {

    private IEmailService iEmailService;

    public VendaService(IEmailService iEmailService){
        this.iEmailService = iEmailService;
    }

    public void enviaEmail( BigDecimal valor){
        System.out.printf("Venda no valor de %s...\n", valor);
        this.iEmailService.enviar();
    }
}
