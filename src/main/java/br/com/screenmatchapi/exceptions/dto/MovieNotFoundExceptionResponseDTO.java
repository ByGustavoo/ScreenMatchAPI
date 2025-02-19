package br.com.screenmatchapi.exceptions.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class MovieNotFoundExceptionResponseDTO {

    private int status;
    private String error;
    private String message;
    private String details;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy - HH:mm:ss")
    private LocalDateTime timestamp;

    public MovieNotFoundExceptionResponseDTO(int status, String error, String message, String details) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.details = details;
        this.timestamp = LocalDateTime.now();
    }

    public static MovieNotFoundExceptionResponseDTO movieNotFoundExceptionDTO = new MovieNotFoundExceptionResponseDTO(
            404,
            "Not Found",
            "Filme Inválido!",
            "O Filme solicitado não foi encontrado!"
    );
}