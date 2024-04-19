package org.example.injecaodependencia.naoacoplada.teste;

import org.example.injecaodependencia.naoacoplada.email.GoogleEmailService;
import org.example.injecaodependencia.naoacoplada.venda.VendaService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class VendaServiceTest {

    @Test
    public void registraVenda() {
        VendaService vendaService = new VendaService(new GoogleEmailService());
        vendaService.enviaEmail(new BigDecimal("100"));
    }
}
