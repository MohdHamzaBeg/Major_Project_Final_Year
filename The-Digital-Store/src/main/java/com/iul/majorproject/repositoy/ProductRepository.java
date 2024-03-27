package com.iul.majorproject.repositoy;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iul.majorproject.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
