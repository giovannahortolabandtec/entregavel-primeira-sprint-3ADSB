package br.com.projeto.entregavel.celia.yoshi.models;

import java.util.ArrayList;
import java.util.List;

public class Cantor extends Musica {

    private String nomeCantor;
    List<Musica> musicas;

    public Cantor(Integer codigo, String nomeCantor, String nomeMusica, Double duracao,
                  Integer anoLancamento, Integer quantShow, Double valorShow) {
        super(codigo, nomeMusica, duracao, anoLancamento, quantShow, valorShow);
        this.nomeCantor = nomeCantor;
        this.musicas = new ArrayList<Musica>();
    }

    @Override
    public Double calculaRendaShowMensal() {
        return getValorShow() * getQuantShow();
    }

    public Double getCalculaShow() {
        return calculaRendaShowMensal();
    }


    public String getNomeCantor() {
        return nomeCantor;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }
}
