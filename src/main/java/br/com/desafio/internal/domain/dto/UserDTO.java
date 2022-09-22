package br.com.desafio.internal.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private  Integer id;
    private String nome;
    private String login;
    @JsonIgnore
    private String senha;
    private LocalDateTime timestamp;
}
