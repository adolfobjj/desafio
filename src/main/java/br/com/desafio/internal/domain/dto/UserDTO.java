package br.com.desafio.internal.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private  Integer id;
    private String nome;
    private String login;
    private LocalDateTime timestamp;
}
