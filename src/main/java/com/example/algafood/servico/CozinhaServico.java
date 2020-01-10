package com.example.algafood.servico;

import com.example.algafood.dominio.Cozinha;

import javax.validation.Valid;

public interface CozinhaServico {

    Cozinha incluir(@Valid Cozinha cozinha);

    Cozinha obterPorId(Long id);

}
