package com.biblioteca.service;

import com.biblioteca.repository.BibliotecaRepository;
import com.biblioteca.model.Livro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecaService {

    public List<Livro> buscaLivros(){
        return BibliotecaRepository.buscaLivros();
    }
}
