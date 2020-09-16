package com.promineotech.inventorymanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.inventorymanagement.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
