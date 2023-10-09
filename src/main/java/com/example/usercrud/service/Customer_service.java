package com.example.usercrud.service;

import com.example.usercrud.model.Customer_details;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface Customer_service {
    Page<Customer_details> usersByPage(int page);
    Customer_details createCustomer( Customer_details user);
    Customer_details getCustomerByID(long id);
    Customer_details updateCustomerByID(long id , Customer_details user);
    Customer_details deleteCustomerByID( long id);
}
