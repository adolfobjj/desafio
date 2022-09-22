package br.com.desafio.internal.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StandardError {

    private Integer status;
    private Long timestamp;
    private String message;

    public StandardError(LocalDateTime now, int value, String message, String requestURI) {
    }
}

//Erro padrao com localdate