package com.iul.majorproject.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iul.majorproject.model.Product;
import com.iul.majorproject.repositoy.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> listofProducts() {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> getProductbyId(int id) {
		Optional<Product> product = productRepository.findById(id);
		return product;
	}

}
