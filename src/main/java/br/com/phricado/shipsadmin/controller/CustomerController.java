package br.com.phricado.shipsadmin.controller;

import br.com.phricado.shipsadmin.dto.CustomerDTO;
import br.com.phricado.shipsadmin.model.CustomerModel;
import br.com.phricado.shipsadmin.service.CustomerService;
import io.micronaut.http.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@Controller("/api/customer")
public class CustomerController {

    @Get
    public List<CustomerModel> getCustomers() {
        return CustomerService.getCustomers();
    }

    @Post
    public CustomerModel register(@Body @Valid CustomerDTO customerDTO) {
        CustomerModel customerModel = CustomerModel.converter(customerDTO);
        CustomerService.add(customerModel);
        return customerModel;

    }

    @Get("/{identifier}")
    public CustomerModel selectCustomer(@PathVariable UUID identifier) {
        return CustomerService.selectByIdentifier(identifier);
    }

    @Delete("/{identifier}")
    public Boolean deleteCustomer(@PathVariable UUID identifier){
        CustomerModel customer = CustomerService.selectByIdentifier(identifier);
        return CustomerService.remove(customer);
    }

}
