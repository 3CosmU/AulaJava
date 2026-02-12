package com.apostila.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apostila.app.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
