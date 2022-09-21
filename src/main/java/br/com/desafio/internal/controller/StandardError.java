package br.com.desafio.internal.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StandardError {

    private Integer status;
    private Long timestamp;
    private String message;

}
