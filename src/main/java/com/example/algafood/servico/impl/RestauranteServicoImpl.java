package com.example.algafood.servico.impl;

import com.example.algafood.servico.RestauranteServico;
import com.example.algafood.servico.dto.RestauranteDTO;

import javax.validation.Valid;

public class RestauranteServicoImpl implements RestauranteServico {

    @Override
    public RestauranteDTO incluir(@Valid RestauranteDTO restauranteDTO) {
        return null;
    }

    @Override
    public RestauranteDTO obterPorId(Long id) {
        return null;
    }

}
