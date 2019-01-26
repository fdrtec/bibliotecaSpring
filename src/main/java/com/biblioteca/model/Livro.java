package com.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Livro {
    @Id
    private Long Id;
    private String nome;
    private String descrição;
    private Long autorId;
    private Long editoraId;

    public Livro(String nome, String descrição, Long autorId, Long editoraId) {
        this.nome = nome;
        this.descrição = descrição;
        this.autorId = autorId;
        this.editoraId = editoraId;
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

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Long getAutorId() {
        return autorId;
    }

    public void setAutorId(Long autorId) {
        this.autorId = autorId;
    }

    public Long getEditoraId() {
        return editoraId;
    }

    public void setEditoraId(Long editoraId) {
        this.editoraId = editoraId;
    }
}
