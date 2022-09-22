package br.com.desafio.internal.service.exception;

public class DataIntegratyViolationException extends RuntimeException{

    public DataIntegratyViolationException(String message) {
        super(message);
    }
}
//violação de integração de dados