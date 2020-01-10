package com.example.algafood.repositorio;

import com.example.algafood.dominio.Cozinha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CozinhaRepositorio extends JpaRepository<Cozinha, Long>, JpaSpecificationExecutor<Cozinha> {
}
