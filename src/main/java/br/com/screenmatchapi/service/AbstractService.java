package br.com.screenmatchapi.service;

import br.com.screenmatchapi.model.dto.MovieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public abstract class AbstractService {

    @Autowired
    private WebClient webClient;

    @Value("${SECRET}")
    private String secret;

    public MovieDTO findMovie(String pTitle) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("t", pTitle)
                        .queryParam("plot", "full")
                        .queryParam("apikey", secret)
                        .build())
                .retrieve()
                .bodyToMono(MovieDTO.class)
                .block();
    }
}