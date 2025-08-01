package com.example.users.model;

import java.util.Map;

public final class UserSource {

  private static final Map<Long, User> userMap = Map.of(
    2L, new User("1020", "Ramón", "Comediante"),
    3L, new User("1030", "MJ", "Jefa"),
    4L, new User("1040", "Álvaro G", "Nini")
  );

  public static User getUser(Product product) {
    return userMap.get(product.id());
  }

}
