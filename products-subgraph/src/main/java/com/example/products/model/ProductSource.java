package com.example.products.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class ProductSource {

  @Bean
  public CommandLineRunner initProducts(ProductRepository repository) {
    return args -> {
      repository.saveAll(List.of(
        new Product("Saturn V", "The Original Super Heavy-Lift Rocket!"),
        new Product("Lunar Module"),
        new Product("Space Shuttle"),
        new Product("Falcon 9", "Reusable Medium-Lift Rocket"),
        new Product("Dragon", "Reusable Medium-Lift Rocket"),
        new Product("Starship", "Super Heavy-Lift Reusable Launch Vehicle")
      ));
    };
  }

}
