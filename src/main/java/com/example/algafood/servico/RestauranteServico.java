package com.example.algafood.servico;

import com.example.algafood.servico.dto.RestauranteDTO;

import javax.validation.Valid;

public interface RestauranteServico {

    RestauranteDTO incluir(@Valid RestauranteDTO restauranteDTO);

    RestauranteDTO obterPorId(Long id);

}
