package br.com.desafio.internal.service;

import br.com.desafio.internal.domain.Usuario;
import br.com.desafio.internal.domain.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    Usuario findById(Integer id);
    List<Usuario> findAll(); //implementação na interface do findAll
    Usuario create(UserDTO obj); //salva um usuario no banco
    Usuario update(UserDTO obj);// atualiza
     void delete(Integer id);
}
