package com.example.algafood.repositorio;

import com.example.algafood.dominio.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RestauranteRepositorio extends JpaRepository<Restaurante, Long>, JpaSpecificationExecutor<Restaurante> {
}
