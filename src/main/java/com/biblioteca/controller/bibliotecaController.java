package com.biblioteca.controller;


import com.biblioteca.service.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class bibliotecaController {

    @Autowired
    BibliotecaService bibliotecaService;

    @RequestMapping("/busca-livros")
    public List buscaLivros(){
        return bibliotecaService.buscaLivros();
    }
}
