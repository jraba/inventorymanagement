package com.promineotech.inventorymanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.inventorymanagement.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
