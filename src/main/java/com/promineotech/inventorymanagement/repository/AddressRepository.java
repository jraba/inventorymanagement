package com.promineotech.inventorymanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.inventorymanagement.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
