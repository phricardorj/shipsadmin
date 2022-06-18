package br.com.phricado.shipsadmin.model;

import br.com.phricado.shipsadmin.dto.CustomerDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Setter @Getter
public class CustomerModel {
    private UUID id;
    private String identifier;
    private String category;
    private String from;
    private String to;

    public CustomerModel(String identifier, String category, String from, String to) {
        this.id = UUID.randomUUID();
        this.identifier = identifier;
        this.category = category;
        this.from = from;
        this.to = to;
    }


    public static CustomerModel converter(CustomerDTO customerDTO){
        return new CustomerModel(customerDTO.getIdentifier(), customerDTO.getCategory(), customerDTO.getFrom(), customerDTO.getTo());
    }
}
