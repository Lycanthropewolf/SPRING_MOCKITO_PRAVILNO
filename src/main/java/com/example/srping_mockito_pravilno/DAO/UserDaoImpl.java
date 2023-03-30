package com.example.srping_mockito_pravilno.DAO;

import com.example.srping_mockito_pravilno.User;

import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private final List<User> users;

    public UserDaoImpl() {
        this.users = Arrays.asList(
                new User("Dima"),
                new User("Vasya")

        );
    }

    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }
}
