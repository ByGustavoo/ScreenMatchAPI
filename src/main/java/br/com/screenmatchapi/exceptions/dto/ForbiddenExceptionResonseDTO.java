package br.com.screenmatchapi.exceptions.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class ForbiddenExceptionResonseDTO {

    private int status;
    private String error;
    private String message;
    private String details;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy - HH:mm:ss")
    private LocalDateTime timestamp;

    public ForbiddenExceptionResonseDTO(int status, String error, String message, String details) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.details = details;
        this.timestamp = LocalDateTime.now();
    }

    public static ForbiddenExceptionResonseDTO forbiddenResponseDTO = new ForbiddenExceptionResonseDTO(
            403,
            "Forbidden",
            "Acesso Negado!",
            "Sua APIKey está inválida! Por favor, insira uma APIKey válida!"
    );
}