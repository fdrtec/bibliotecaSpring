package com.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autor {

    @Id
    private Long Id;
    private String nome;

    public Autor(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
