package com.promineotech.inventorymanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.inventorymanagement.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
