

import java.util.ArrayList;
import java.util.List;

public class Depoimento {
    private int dia;
    private int mes;
    private int ano;
    private String nomeDepoente;
    private String texto;

    public Depoimento(int dia, int mes, int ano, String nomeDepoente, String texto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.nomeDepoente = nomeDepoente;
        this.texto = texto;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String getNomeDepoente() {
        return nomeDepoente;
    }

    public String getTexto() {
        return texto;
    }
}
