package com.apostila.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apostila.app.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    Usuario findByLogin(String login); // Método para buscar usuário pelo login [7]
}
