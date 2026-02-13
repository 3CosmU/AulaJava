package br.com.curso.demo.repository;

import br.com.curso.demo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    Usuario findByLogin(String login); // Método mágico do Spring Data
}