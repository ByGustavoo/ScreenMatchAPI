package br.com.screenmatchapi.exceptions;

public class MovieNameException extends RuntimeException {

    public MovieNameException() {
        super("O Parâmetro 'movieName' é obrigatório para buscar o nome de um Filme!");
    }
}