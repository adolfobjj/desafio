package br.com.desafio.internal.service;

import br.com.desafio.internal.domain.Usuario;
import br.com.desafio.internal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario findById(Integer id){
        Optional<Usuario> obj = repository.findById(id);
        return obj.orElse(null);

    }
}
