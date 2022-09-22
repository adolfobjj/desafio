package br.com.desafio.internal.repository;

import br.com.desafio.internal.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface UserRepository extends JpaRepository<User,Integer> {
}
