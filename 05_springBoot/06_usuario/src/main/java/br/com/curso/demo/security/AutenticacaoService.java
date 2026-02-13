package br.com.curso.demo.security;

import br.com.curso.demo.models.Usuario;
import br.com.curso.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Service
public class AutenticacaoService implements UserDetailsService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByLogin(username);

        if (usuario == null) {
            throw new UsernameNotFoundException("Usuário não encontrado!");
        }

        return usuario;
    }

    @Configuration
    @EnableWebSecurity
    public class WebSecurityConfig {
        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
            http
                    .authorizeHttpRequests((requests) -> requests
                            // Permite acesso sem login à página de cadastro e ao salvamento
                            .requestMatchers("/cadastro", "/salvarUsuario", "/css/**").permitAll()
                            // Qualquer outra requisição requer autenticação
                            .anyRequest().authenticated())
                    .formLogin((form) -> form
                            .loginPage("/login") // Define nossa página customizada
                            .defaultSuccessUrl("/home", true) // Redireciona após sucesso
                            .permitAll())
                    .logout((logout) -> logout
                            .logoutUrl("/logout") // URL para acionar logout
                            .logoutSuccessUrl("/login?logout") // Para onde vai após sair
                            .permitAll());
            return http.build();
        }

        // Bean para criptografar senhas (Hash) [6]
        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }
    }

}