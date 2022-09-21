package br.com.desafio.internal;

import br.com.desafio.internal.domain.Usuario;
import br.com.desafio.internal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class InternalApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;


	public static void main(String[] args) {

		SpringApplication.run(InternalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Luiz Adolfo", "Luiz", "123456" );
		Usuario u2 = new Usuario(null, "Felipe Augusto", "Felipe", "123456" );

		usuarioRepository.saveAll(Arrays.asList(u1,u2));
	}
}
