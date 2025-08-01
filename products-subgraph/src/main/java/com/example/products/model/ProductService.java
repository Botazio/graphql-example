package com.example.products.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  public Product getProduct(Long id) {
    return productRepository.findById(id).orElse(null);
  }

  public List<Product> getProducts() {
    return productRepository.findAll();
  }
}
