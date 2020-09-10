package br.com.projeto.entregavel.celia.yoshi.models;

public class Musica implements Musicista{

    private Integer codigo;
    private String nomeMusica;
    private Double duracao;
    private Integer anoLancamento;
    private Integer quantShow;
    private Double valorShow;

    public Musica(Integer codigo, String nomeMusica, Double duracao, Integer anoLancamento,
                  Integer quantShow, Double valorShow) {
        this.codigo = codigo;
        this.nomeMusica = nomeMusica;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.quantShow = quantShow;
        this.valorShow = valorShow;
    }

    @Override
    public Double calculaRendaShowMensal() {
        return valorShow * quantShow;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public Double getDuracao() {
        return duracao;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public Integer getQuantShow() {
        return quantShow;
    }

    public Double getValorShow() {
        return valorShow;
    }
}
