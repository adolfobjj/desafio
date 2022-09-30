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
    @Autowired
    //private TelefoneRepository repository2;

    @Bean
    public void startDB() {
        //instanciando 3 usuarios no banco para teste
//        Telefone t1 = new Telefone(null,"1111111");
//        Telefone t2 = new Telefone(null,"2111111");
//        Telefone t3 = new Telefone(null,"3111111");
        Usuario u1 = new Usuario(null, "Luiz Adolfo", "luiz.a.tucunduva@avanade.com", "123",LocalDate.now(),null);
        Usuario u2 = new Usuario(null, "Felipe Augusto", "felipe@avanade.com", "123",LocalDate.now(),null);
        Usuario u3 = new Usuario(null, "Vinicius", "vinicius@avanade.com", "123",LocalDate.now(),null);

        //repository2.saveAll(List.of(t1, t2, t3));
        repository.saveAll(List.of(u1, u2, u3));

    }
}
