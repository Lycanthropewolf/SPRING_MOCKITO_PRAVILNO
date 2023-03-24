package com.example.srping_mockito_pravilno.DAO;

import com.example.srping_mockito_pravilno.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class UserDaoImplTest {
    private UserDaoImpl userDao = new UserDaoImpl();

    @Test
    void getUserByName() {
        User user = new User("Vasya");
        userDao.getUserByName("егш");

        Assertions.assertNotNull(userDao);
    }

    @Test
    void getUserByNameOrNull(String name) {
        name = "Dima";
        User user1 = new User("Vasya");
        User user2 = new User("Petya");
        User user3 = new User("Dima");
        List<User> expected = new ArrayList<>();
        expected.add(user1);
        expected.add(user2);
        expected.add(user3);
        userDao.getUserByName(name);
        Assertions.assertNull(userDao);
    }

    @Test
    void getAllUsers() {
        User user1 = new User("Vasya");
        User user2 = new User("Petya");
        User user3 = new User("Dima");
        List<User> expected = new ArrayList<>();
        expected.add(user1);
        expected.add(user2);
        expected.add(user3);
        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);
        Assertions.assertEquals(expected, actual);
    }
}