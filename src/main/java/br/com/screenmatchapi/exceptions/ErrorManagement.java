package br.com.screenmatchapi.exceptions;

import br.com.screenmatchapi.exceptions.dto.BadRequestExceptionResponseDTO;
import br.com.screenmatchapi.exceptions.dto.RuntimeExceptionResponseDTO;
import br.com.screenmatchapi.exceptions.dto.UnauthorizedExceptionResonseDTO;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@RestControllerAdvice
public class ErrorManagement {

    @ExceptionHandler(WebClientResponseException.Unauthorized.class)
    public ResponseEntity<?> unauthorizedException() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(UnauthorizedExceptionResonseDTO.unauthorizedResponseDTO);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<?> badRequestExceptionException() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(BadRequestExceptionResponseDTO.badRequestExceptionResponseDTO);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> runtimeException(Exception ex) {
        RuntimeExceptionResponseDTO runtimeExceptionResponseDTO = new RuntimeExceptionResponseDTO(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Internal Server Error",
                "Ocorreu um erro interno no Servidor! Por favor, tente novamente.",
                ex.getLocalizedMessage());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(runtimeExceptionResponseDTO);
    }
}