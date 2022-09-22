package br.com.desafio.internal.service.Impl;


import br.com.desafio.internal.domain.Usuario;
import br.com.desafio.internal.domain.dto.UserDTO;
import br.com.desafio.internal.repository.UserRepository;
import br.com.desafio.internal.service.UserService;
import br.com.desafio.internal.service.exception.DataIntegratyViolationException;
import br.com.desafio.internal.service.exception.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Usuario findById(Integer id) {
        Optional<Usuario> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Usuario> findAll() { //busca todos os usuarios

        return repository.findAll();
    }

    @Override
    public Usuario create(UserDTO obj) { //salva user
        findByEmail(obj);
        return repository.save(mapper.map(obj, Usuario.class));
    }

    @Override
    public Usuario update(UserDTO obj) {
        findByEmail(obj);
        return repository.save(mapper.map(obj, Usuario.class));
    }

    @Override
    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }

    private void findByEmail(UserDTO obj) {
        Optional<Usuario> user = repository.findByEmail(obj.getEmail());
        if(user.isPresent() && !user.get().getId().equals(obj.getId())) {
            throw new DataIntegratyViolationException("E-mail já cadastrado no sistema");
        }
    }
}
//