package br.com.desafio.internal.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @NotEmpty(message = "Campo nome é mandatório")
    @Length(min = 4, max = 20, message = "Entre 4 e 20 caracteres.")
    private String nome;
    @NotEmpty(message = "Campo login é mandatório")
    @Length(min = 4, max = 20, message = "Entre 4 e 20 caracteres.")
    private String login;
    @NotEmpty(message = "Campo senha é mandatório")
    @Length(min = 4, max = 20, message = "Entre 4 e 20 caracteres.")
    private String senha;

}
