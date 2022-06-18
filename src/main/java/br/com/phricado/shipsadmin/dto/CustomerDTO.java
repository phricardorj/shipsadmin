package br.com.phricado.shipsadmin.dto;


import io.micronaut.core.annotation.Introspected;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter @Setter @Introspected
public class CustomerDTO {
    @NotEmpty @NotNull
    private String name;
    @NotEmpty @NotNull
    private String document;
    @NotEmpty @NotNull
    private String country;

}