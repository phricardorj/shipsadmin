package br.com.phricado.shipsadmin.controller;

import br.com.phricado.shipsadmin.dto.CustomerDTO;
import br.com.phricado.shipsadmin.model.CustomerModel;
import br.com.phricado.shipsadmin.service.CustomerService;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import java.util.List;

@Controller("/api/customer")
public class CustomerController {

    @Get
    public List<CustomerModel> getCustomers() {
        return CustomerService.getCustomers();
    }

    @Post
    public CustomerModel register(@Body CustomerDTO customerDTO) {
        CustomerModel customerModel = CustomerModel.converter(customerDTO);
        CustomerService.add(customerModel);
        return customerModel;
    }

}
