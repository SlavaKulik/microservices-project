package com.slavakulyk.productservice.repository;

import com.slavakulyk.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
