package com.example.loja.aberta.application.dto.request;

import com.example.loja.aberta.application.validator.MinAno;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class AdicionarCartaoDTO {

    @NotBlank
    @Size(min = 16, max = 16)
    private String numero;

    @NotNull
    @Max(999)
    private Integer cvv;

    @NotNull
    @Min(1)
    @Max(12)
    private Integer mesValidade;

    @MinAno
    private Integer anoValidade;
}
