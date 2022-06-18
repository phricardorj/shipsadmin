package br.com.phricado.shipsadmin.controller;

import br.com.phricado.shipsadmin.dto.CustomerDTO;
import br.com.phricado.shipsadmin.model.CustomerModel;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import java.util.List;

@Controller("/api/customer")
public class CustomerController {

    @Get
    public List<CustomerModel> getCustomers() {
        return CustomerModel.getCustomers();
    }

    @Post
    public CustomerModel register(@Body CustomerDTO customerDTO) {
        CustomerModel customerModel = CustomerModel.converter(customerDTO);
        CustomerModel.add(customerModel);
        return customerModel;
    }

}
