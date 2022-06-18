package br.com.phricado.shipsadmin.dto;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CustomerDTO {
    private String identifier;
    private String category;
    private String from;
    private String to;
}