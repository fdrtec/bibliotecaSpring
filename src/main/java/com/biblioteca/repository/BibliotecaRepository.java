package com.biblioteca.repository;

import com.biblioteca.model.Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BibliotecaRepository {

    public static List buscaLivros (){
        return Collections.singletonList(new ArrayList()
                .add(new Livro("Hobbit", "Aventura", 123L, 456L)));
    }
}
