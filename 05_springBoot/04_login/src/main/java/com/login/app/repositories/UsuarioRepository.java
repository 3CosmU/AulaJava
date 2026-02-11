package com.login.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.login.app.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
