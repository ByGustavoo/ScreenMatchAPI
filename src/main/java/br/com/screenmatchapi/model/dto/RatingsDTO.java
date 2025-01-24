package br.com.screenmatchapi.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RatingsDTO {

    @JsonIgnore
    private Integer id;

    @NotNull
    @JsonIgnore
    @Size(max = 20)
    private String movieId;

    @NotNull
    @Size(max = 50)
    @JsonProperty("Source")
    private String source;

    @NotNull
    @Size(max = 10)
    @JsonProperty("Value")
    private String value;
}