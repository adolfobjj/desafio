package br.com.desafio.internal.config;


import br.com.desafio.internal.domain.Usuario;
import br.com.desafio.internal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;
import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        Usuario u1 = new Usuario(null, "Luiz Adolfo", "luiz.a.tucunduva@avanade.com", "123", LocalDate.now());
        Usuario u2 = new Usuario(null, "Felipe Auugusto", "felipe@avanade.com", "123",LocalDate.now());
        Usuario u3 = new Usuario(null, "Vinicius", "vinicius@avanade.com", "123",LocalDate.now());

        repository.saveAll(List.of(u1, u2, u3));
    }
}