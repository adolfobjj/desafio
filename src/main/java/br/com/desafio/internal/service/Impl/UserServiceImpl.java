package br.com.desafio.internal.service.Impl;


import br.com.desafio.internal.domain.User;
import br.com.desafio.internal.domain.dto.UserDTO;
import br.com.desafio.internal.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
