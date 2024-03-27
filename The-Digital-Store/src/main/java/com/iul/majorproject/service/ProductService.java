package com.iul.majorproject.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.iul.majorproject.model.Product;

public interface ProductService {
	List<Product> listofProducts();
	
	Optional<Product> getProductbyId(int id);

	
}
