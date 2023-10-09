package com.example.usercrud.repository;

import com.example.usercrud.model.Customer_details;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Customer_repository extends JpaRepository<Customer_details, Long> {
//    List<Customer_details> findAll(Pageable pageable);
}
