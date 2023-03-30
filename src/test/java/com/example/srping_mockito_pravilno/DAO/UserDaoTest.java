package com.example.srping_mockito_pravilno.DAO;

import com.example.srping_mockito_pravilno.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    private final UserDao dao = new UserDaoImpl();

    @Test
    public void getUserByNameTry() {
        User user = dao.getUserByName("Vasya");
        Assertions.assertNotNull(user);

    }

    @Test
    public void NameEquals() {
        User user = dao.getUserByName("Dima");
        Assertions.assertEquals(user.getName(), "Dima");
    }

    @Test
    public void gerUserByNameFalse() {
        User user = dao.getUserByName("Petya");
        Assertions.assertNull(user);
    }

    @Test
    void findAllUsers() {
        List<User> users1 = List.of(new User("Dima"), new User("Vasya"));
        Assertions.assertEquals(dao.findAllUsers(),users1);
    }
}