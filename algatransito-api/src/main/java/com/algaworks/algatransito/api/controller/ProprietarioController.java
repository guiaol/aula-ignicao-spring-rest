package com.algaworks.algatransito.api.controller;

import com.algaworks.algatransito.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {

    @GetMapping("/proprietarios")
    public List<Proprietario> listar() {

        Proprietario p1 = new Proprietario();
        p1.setId(1L);
        p1.setNome("João");
        p1.setTelefone("34 99999-1111");
        p1.setEmail("joaodascouves@algaworks.com");

        Proprietario p2 = new Proprietario();
        p2.setId(2L);
        p2.setNome("Maria");
        p2.setTelefone("11 97777-1111");
        p2.setEmail("mariadasilva@algaworks.com");

        return Arrays.asList(p1, p2);
    }
}
