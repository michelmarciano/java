package org.example.dominio.optional.algaworks;

import java.io.ObjectStreamException;
import java.util.Objects;

public class Reserva {

    private final String codigo;
    private final Voo voo;
    private final Passageiro passageiro;
    private int quantidadeBagagens;


    public Reserva (String codigo, Voo voo, String nomePassageiro){
        Objects.requireNonNull(codigo);
        Objects.requireNonNull(voo);
        Objects.requireNonNull(nomePassageiro);
        this.codigo = codigo;
        this.voo = voo;
        this.passageiro = new Passageiro(nomePassageiro);
    }

    public String getCodigo() {
        return codigo;
    }

    public Voo getVoo() {
        return voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public int getQuantidadeBagagens() {
        return quantidadeBagagens;
    }

    public void setQuantidadeBagagens(int quantidadeBagagens) {
        this.quantidadeBagagens = quantidadeBagagens;
    }


    @Override
    public String toString() {
        return "Reserva{" +
                "codigo='" + codigo + '\'' +
                ", voo=" + voo +
                ", passageiro=" + passageiro +
                ", quantidadeBagagens=" + quantidadeBagagens +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reserva reserva = (Reserva) o;

        if (quantidadeBagagens != reserva.quantidadeBagagens) return false;
        if (!codigo.equals(reserva.codigo)) return false;
        if (!voo.equals(reserva.voo)) return false;
        return passageiro.equals(reserva.passageiro);
    }

    @Override
    public int hashCode() {
        int result = codigo.hashCode();
        result = 31 * result + voo.hashCode();
        result = 31 * result + passageiro.hashCode();
        result = 31 * result + quantidadeBagagens;
        return result;
    }
}
