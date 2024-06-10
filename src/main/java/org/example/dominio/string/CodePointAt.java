package org.example.dominio.string;

public class CodePointAt {

    public int devolveUnicode(String valor, int index){
        return valor.codePointAt(index);
    }
}
