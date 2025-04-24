package com.guilherme.relacionamento.repository;

import com.guilherme.relacionamento.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}