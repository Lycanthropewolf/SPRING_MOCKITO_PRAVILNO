package com.example.srping_mockito_pravilno.DAO;

import com.example.srping_mockito_pravilno.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDaoImpl {
    private static List<User> users = new ArrayList<>();

    public UserDaoImpl() {
        User user1 = new User("Vasya");
        User user2 = new User("Petya");
        User user3 = new User("Dima");
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public User getUserByName(String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.contains(name)) {
                return users.get(i);
            }
        }
        return null;
    }


    public List<User> getAllUsers() {
        return Collections.unmodifiableList(users);
    }

}
