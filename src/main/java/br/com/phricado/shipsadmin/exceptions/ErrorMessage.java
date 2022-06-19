package br.com.phricado.shipsadmin.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ErrorMessage {
    private String message;
    private String currentDate;
    private Boolean status;
}