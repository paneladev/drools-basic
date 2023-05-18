package org.example;

import java.time.LocalDate;

public class Cnh {

    private String numero;

    private String nome;

    private int pontos;

    private LocalDate dataExpiracao;

    private Status status = Status.NAO_PROCESSADA;

    private String causa;

    public Cnh() {

    }

    public boolean isExpirada() {
        return dataExpiracao.isBefore(LocalDate.now());
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(LocalDate dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    @Override
    public String toString() {
        return String.format("CNH[numero:%s, nome:%s]", numero, nome);
    }
}
