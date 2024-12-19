package com.crud.crud.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Date;


public class ClienteEntity {

    private int id;

    private String nome;

    private String cpf;

    @Column(name = "data_criacao")
    private Date dataCriacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
