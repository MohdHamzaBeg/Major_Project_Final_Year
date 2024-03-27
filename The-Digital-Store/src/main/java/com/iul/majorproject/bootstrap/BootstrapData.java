package com.iul.majorproject.bootstrap;

import java.util.Random;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.iul.majorproject.model.Product;
import com.iul.majorproject.repositoy.ProductRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor	
public class BootstrapData implements CommandLineRunner{
	
	private final ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		forProducts();
	}

	private void forProducts() {
		if(productRepository.count()==0) {
			Random random = new Random();
			
			Product p1 = Product.builder()
					.id(random.nextInt())
					.name("Shoes")
					.rating(4)
					.price(500)
					.build();
			
			Product p3 = Product.builder()
					.id(random.nextInt())
					.name("Red Shirt")
					.rating(5)
					.price(2999.99)
					.build();
			
			Product p4 = Product.builder()
					.id(random.nextInt())
					.name("Black Trousers")
					.rating(1)
					.price(599.88)
					.build();
			
			Product p5 = Product.builder()
					.id(random.nextInt())
					.name("G-shock")
					.rating(2)
					.price(899.99)
					.build();
		
			Product p2 = Product.builder()
					.id(random.nextInt())
					.name("Shoes")
					.rating(3)
					.price(899l)
					.build();
			
			Product p6 = Product.builder()
					.id(random.nextInt())
					.name("Sneakers")
					.rating(1)
					.price(499.99)
					.build();
			
			productRepository.save(p1);
			productRepository.save(p2);
			productRepository.save(p3);
			productRepository.save(p5);
			productRepository.save(p4);
			productRepository.save(p6);
		}
	}

}
