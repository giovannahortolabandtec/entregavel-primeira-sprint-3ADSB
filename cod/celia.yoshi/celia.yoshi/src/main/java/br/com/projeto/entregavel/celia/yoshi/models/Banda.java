package br.com.projeto.entregavel.celia.yoshi.models;

import java.util.ArrayList;
import java.util.List;

public class Banda extends Musica {

    private String nomeBanda;
    List<Musica> musica;

    public Banda(Integer codigo, String nomeBanda, String nomeMusica, Double duracao,
                 Integer anoLancamento, Integer quantShow, Double valorShow) {
        super(codigo, nomeMusica, duracao, anoLancamento, quantShow, valorShow);
        this.nomeBanda = nomeBanda;
        this.musica = new ArrayList<Musica>();
    }

    @Override
    public Double calculaRendaShowMensal() {
        return getValorShow() * getQuantShow();
    }

    public Double getCalculaShow() {
        return calculaRendaShowMensal();
    }

    public String getNomeBanda() {
        return nomeBanda;
    }

    public List<Musica> getMusica() {
        return musica;
    }
}
