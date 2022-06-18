package br.com.phricado.shipsadmin.service;

import br.com.phricado.shipsadmin.model.CustomerModel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Slf4j
public class CustomerService {
    @Getter
    private static final List<CustomerModel> customers = new ArrayList<>();

    public static void add(CustomerModel customerModel){
        log.info("Added new Customer");
        customers.add(customerModel);
    }

    public static CustomerModel selectByIdentifier(UUID identifier) {
        log.info("Returning Customer by identifier!");
        return Objects.requireNonNull(customers.stream().filter(customerModel -> customerModel.getIdentifier().equals(identifier)).findFirst().orElse(null));
    }

    public static Boolean remove(CustomerModel customer){
        return customers.remove(customer);
    }
}
