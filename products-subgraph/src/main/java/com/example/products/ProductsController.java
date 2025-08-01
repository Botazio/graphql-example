package com.example.products;

import java.util.List;

import com.example.products.model.Product;
import com.example.products.model.ProductService;
import com.example.products.model.ProductSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProductsController {

  @Autowired
  private ProductService productService;

  @QueryMapping
  public Product product(@Argument Long id) {
    return productService.getProduct(id);
  }

  @QueryMapping
  public List<Product> products() {
    return productService.getProducts();
  }

}
