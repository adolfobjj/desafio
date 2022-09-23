package br.com.desafio.internal.service.Impl;

import br.com.desafio.internal.domain.Usuario;
import br.com.desafio.internal.domain.dto.UserDTO;
import br.com.desafio.internal.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;
@SpringBootTest
class UserServiceImplTest {

    public static final Integer ID = 1;
    public static final String NAME = "Luiz Adolfo";
    public static final String EMAIL = "luiz.a.tucunduva@avanade.com";
    public static final String PASSWORD = "123";
    public static final LocalDate DATE = LocalDate.now();
    @InjectMocks
    private UserServiceImpl service;
    @Mock
    private UserRepository repository;
    @Mock
    private ModelMapper mapper;

    private Usuario usuario;
    private UserDTO userDto;
    private Optional<Usuario> optionalUser;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUser();
    }

    @Test
    void whenFindByIdThenReturnAnUserInstance() {
        Mockito.when(repository.findById(Mockito.anyInt())).thenReturn(optionalUser);
        Usuario response = service.findById(ID);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Usuario.class, response.getClass());
        Assertions.assertEquals(ID, response.getId());
        Assertions.assertEquals(NAME, response.getName());
        Assertions.assertEquals(EMAIL, response.getEmail());

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
        userDto = new UserDTO(ID, NAME, EMAIL, PASSWORD, DATE);
        optionalUser = Optional.of(new Usuario(ID, NAME, EMAIL, PASSWORD, DATE));
    }
}
