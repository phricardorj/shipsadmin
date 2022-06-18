package br.com.phricado.shipsadmin.model;

import br.com.phricado.shipsadmin.dto.CustomerDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Setter @Getter
public class CustomerModel {
    private UUID identifier;
    private String category;
    private String from;
    private String to;

    public CustomerModel(String category, String from, String to) {
        this.identifier = UUID.randomUUID();
        this.category = category;
        this.from = from;
        this.to = to;
    }

    public static CustomerModel converter(CustomerDTO customerDTO){
        return new CustomerModel(customerDTO.getCategory(), customerDTO.getFrom(), customerDTO.getTo());
    }
}
