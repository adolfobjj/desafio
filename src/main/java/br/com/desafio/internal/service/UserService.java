package br.com.desafio.internal.service;

import br.com.desafio.internal.domain.User;
import br.com.desafio.internal.repository.UserRepository;
import br.com.desafio.internal.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    @Autowired
    private UserRepository repository;

    public User findById(Integer id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Usuario não encontrado com o Id : " + id + ", " + "Tipo: " + User.class.getName()));

    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User update(Integer id, User obj) {
        User newObj = findById(id);
        newObj.setNome(obj.getNome());
        newObj.setLogin(obj.getLogin());
        newObj.setSenha(obj.getSenha());
        return repository.save(newObj);
    }

    public User create(User obj) {
        obj.setId(null);
        return repository.save(obj);

    }

    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }
}
