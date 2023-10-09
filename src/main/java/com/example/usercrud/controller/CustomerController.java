package com.example.usercrud.controller;

import com.example.usercrud.model.Customer_details;
import com.example.usercrud.repository.Customer_repository;
import com.example.usercrud.service.Customer_service_Imple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("api")
public class CustomerController {
    @Autowired
    private Customer_service_Imple customer_service_imple;

    @GetMapping("/users/{page}")
    public Page<Customer_details> users(@PathVariable(value="page") int page){
        return customer_service_imple.usersByPage(page);
    }

    @PostMapping("/putCustomer")
    public Customer_details createUser(@RequestBody Customer_details customer_details) {
//        customer_details.setDob(new SimpleDateFormat("yyyy/MM/dd").parse(String.valueOf(customer_details.getDob())));

        return customer_service_imple.createCustomer(customer_details);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<Customer_details> getUserByID(@PathVariable long id){
        return ResponseEntity.ok(customer_service_imple.getCustomerByID(id));
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<Customer_details> updateUserByID(@PathVariable long id ,@RequestBody Customer_details customer){
        return ResponseEntity.ok(customer_service_imple.updateCustomerByID(id , customer));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Customer_details> deleteUserByID(@PathVariable long id){
        return new ResponseEntity<>(customer_service_imple.deleteCustomerByID(id) , HttpStatus.NO_CONTENT);
    }
}
