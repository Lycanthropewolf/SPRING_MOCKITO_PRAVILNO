package com.example.srping_mockito_pravilno.DAO;

import com.example.srping_mockito_pravilno.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);
    List<User> findAllUsers();
}
