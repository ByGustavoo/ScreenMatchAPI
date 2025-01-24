package br.com.screenmatchapi.exceptions.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class BadRequestExceptionResponseDTO {

    private int status;
    private String error;
    private String message;
    private String details;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy - HH:mm:ss")
    private LocalDateTime timestamp;

    public BadRequestExceptionResponseDTO(int status, String error, String message, String details) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.details = details;
        this.timestamp = LocalDateTime.now();
    }

    public static BadRequestExceptionResponseDTO badRequestExceptionResponseDTO = new BadRequestExceptionResponseDTO(
            400,
            "Bad Request",
            "Requisição Inválida!",
            "O Parâmetro 'movieName' é obrigatório para buscar o nome de um Filme!"
    );
}