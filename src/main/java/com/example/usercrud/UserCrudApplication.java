package com.example.usercrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.usercrud.model.Customer_details;
import com.example.usercrud.repository.Customer_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class UserCrudApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UserCrudApplication.class, args);
	}

	@Autowired
	private com.example.usercrud.repository.Customer_repository customer_repository;

	@Override
	public void run(String... args) throws Exception {
//		Customer_details customer_details = new Customer_details();
//		customer_details.setFirst_name("Ayush");
//		customer_details.setLast_name("Tripathi");
//		customer_details.setGender("male");
//		customer_details.setDob("1999-10-04");
//		customer_details.setId_type(0);
//		customer_details.setId_number("012355466575");
//		customer_repository.save(customer_details);

	}
}
