package br.com.desafio.internal.config;


import br.com.desafio.internal.domain.User;
import br.com.desafio.internal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "Luiz Adolfo", "Luiz", "123");
        User u2 = new User(null, "Felipe Augusto", "Felipe", "123");

        repository.saveAll(List.of(u1, u2));
    }
}