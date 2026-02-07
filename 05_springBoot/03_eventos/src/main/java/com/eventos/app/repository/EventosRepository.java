package com.eventos.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventos.app.models.Evento;

public interface EventosRepository extends CrudRepository <Evento, String> {

// Metodo findById consegue identificar e diferenciar o evento editado de todo os outros eventos
Evento findByIdEvento(long idEvento);


Evento deleteByIdEvento(long idEvento);
}
