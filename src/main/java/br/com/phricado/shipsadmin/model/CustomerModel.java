package br.com.phricado.shipsadmin.model;

import br.com.phricado.shipsadmin.dto.CustomerDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter @Getter
public class CustomerModel {
    private UUID identifier;
    private String name;
    private String document;
    private String country;

    public CustomerModel(String name, String document, String country) {
        this.identifier = UUID.randomUUID();
        this.name = name;
        this.document = document;
        this.country = country;
    }

    public static CustomerModel converter(CustomerDTO customerDTO){
        return new CustomerModel(customerDTO.getName(), customerDTO.getDocument(), customerDTO.getCountry());
    }
}
