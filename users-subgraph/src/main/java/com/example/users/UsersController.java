package com.example.users;

import com.example.users.model.Product;
import com.example.users.model.User;
import com.example.users.model.UserSource;
import org.springframework.graphql.data.federation.EntityMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UsersController {

  @EntityMapping
  public Product product(@Argument Long id) {
    return new Product(id);
  }

  @SchemaMapping(typeName = "Product", field = "user")
  public User user(Product product) {
    return UserSource.getUser(product);
  }

}
