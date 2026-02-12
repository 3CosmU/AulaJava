package com.apostila.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.apostila.app.model.Usuario;
import com.apostila.app.repository.UsuarioRepository;

@Configuration
public class InicializadorUsuario {

    @Bean
    public CommandLineRunner init(UsuarioRepository repository, BCryptPasswordEncoder encoder) {
        return args -> {

            if (repository.findByLogin("admin") == null) {

                Usuario u = new Usuario();
                u.setLogin("admin");
                u.setNomeCompleto("Administrador");
                u.setSenha(encoder.encode("123456"));

                repository.save(u);

                System.out.println("Usuário admin criado com sucesso!");
            }
        };
    }
}
