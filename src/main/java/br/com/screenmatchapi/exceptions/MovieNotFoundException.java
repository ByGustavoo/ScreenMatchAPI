package br.com.screenmatchapi.exceptions;

public class MovieNotFoundException extends RuntimeException {

    public MovieNotFoundException() {
        super("ERRO! O Filme solicitado não foi encontrado!");
    }
}