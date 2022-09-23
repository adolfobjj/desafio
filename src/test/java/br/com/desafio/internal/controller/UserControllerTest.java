package br.com.desafio.internal.controller;

import br.com.desafio.internal.domain.Usuario;
import br.com.desafio.internal.domain.dto.UserDTO;
import br.com.desafio.internal.service.Impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
@SpringBootTest
class UserControllerTest {
    public static final Integer ID = 1;
    public static final String NAME = "Luiz Adolfo";
    public static final String EMAIL = "luiz.a.tucunduva@avanade.com";
    public static final String PASSWORD = "123";
    public static final LocalDate DATE = LocalDate.now();

    @InjectMocks
    private UserController resource;

    private UserServiceImpl service;

    @Mock
    private ModelMapper mapper;
    private Usuario usuario;
    private UserDTO userDTO;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUser();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
    private void startUser(){
        usuario = new Usuario(ID, NAME, EMAIL, PASSWORD, DATE);
        userDTO = new UserDTO(ID, NAME, EMAIL, PASSWORD, DATE);
    }
}