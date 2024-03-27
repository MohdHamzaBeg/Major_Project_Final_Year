package com.iul.majorproject.controller;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iul.majorproject.model.Product;
import com.iul.majorproject.service.ProductService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class ProductsController {

	private final ProductService productService;
	
	@GetMapping("/")
	public String homepage(Model model) {
		model.addAttribute("listProducts", productService.listofProducts());
		return "index";
	}
	
	@GetMapping("/allproducts")
	public String productslist(Model model){
		model.addAttribute("listProducts", productService.listofProducts());
		return "products";
	}	
	
	@GetMapping("/product/{id}")
	public String productPage(@PathVariable("id") int id, Model model){
		model.addAllAttributes(Map.of(
		        "product", productService.getProductbyId(id).get(),
		        "listProducts", productService.listofProducts()
		        // Add more attributes as needed
		    ));
		return "products-details";
		// FIX THE IMAGE ISSUE IN PRODUCTPAGE AND START THE USER PART!!
		
	}
}
