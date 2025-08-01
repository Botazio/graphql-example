package com.example.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.graphql.GraphQlSourceBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.graphql.data.federation.FederationSchemaFactory;

@SpringBootApplication
public class UsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}

  @Bean
  public GraphQlSourceBuilderCustomizer customizer(FederationSchemaFactory factory) {
    return builder -> builder.schemaFactory(factory::createGraphQLSchema);
  }

  @Bean
  FederationSchemaFactory federationSchemaFactory() {
    return new FederationSchemaFactory();
  }

}
