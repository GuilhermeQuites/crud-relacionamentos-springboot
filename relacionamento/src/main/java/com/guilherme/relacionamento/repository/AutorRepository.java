package com.guilherme.relacionamento.repository;

import com.guilherme.relacionamento.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}