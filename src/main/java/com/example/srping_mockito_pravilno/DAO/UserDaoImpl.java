package com.example.srping_mockito_pravilno.DAO;

import com.example.srping_mockito_pravilno.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDaoImpl {
    private final List<User> users = new ArrayList<>();

    public UserDaoImpl() {
        User user1 = new User("Vasya");
        User user2 = new User("Petya");
        User user3 = new User("Dima");
    }

    public List<User> getUserByName(String name) {
        if (users.contains(name)) {
            return users;
        }
        return null;
    }


    public List<User> getAllUsers() {
        return Collections.unmodifiableList(users);
    }
}
