package br.com.desafio.internal.repository;

import br.com.desafio.internal.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
//classe repository
@Repository
public interface UserRepository extends JpaRepository<Usuario, Integer> {


    Optional<Usuario> findByEmail(String email);
}
