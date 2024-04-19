package org.example.injecaodependencia.acoplada.teste;

import org.example.injecaodependencia.acoplada.venda.VendaService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class VendaServiceTest {
    @Test
    public void registrVendaTeste() {
        VendaService venda = new VendaService();
        venda.registrar(new BigDecimal("100"));
    }
}
