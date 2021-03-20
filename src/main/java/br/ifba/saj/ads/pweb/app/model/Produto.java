package br.ifba.saj.ads.pweb.app.model;

public class Produto {

    private Integer id;
    private String nome;
    private Float valor;
    private Integer quantidade;

    public Produto() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        return getId().equals(((Produto)obj).getId());
    }

}
