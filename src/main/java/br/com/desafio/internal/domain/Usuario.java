package br.com.desafio.internal.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    private  Integer id;
    private String nome;
    private String login;
    private String senha;

}
