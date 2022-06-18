package br.com.phricado.shipsadmin.service;

import br.com.phricado.shipsadmin.model.CustomerModel;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    @Getter
    private static final List<CustomerModel> customers = new ArrayList<>();

    public static void add(CustomerModel customerModel){
        customers.add(customerModel);
    }
}
