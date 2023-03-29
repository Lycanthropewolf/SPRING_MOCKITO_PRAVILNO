package com.example.srping_mockito_pravilno.SERVICE;

import com.example.srping_mockito_pravilno.DAO.UserDao;
import com.example.srping_mockito_pravilno.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    private final List<User> users = List.of(new User("Dima"), new User("Petya"));

    @Mock
    private UserDao dao;
    @InjectMocks
    private UserService userService;

    @Test
    public void checkUserExistTrue() {
        when(dao.findAllUsers()).thenReturn(users);
        User user1 = new User("Petya");
        assertTrue(dao.findAllUsers().contains(user1));
    }
    @Test
    public void checkUserExistFalse(){
        when(dao.findAllUsers()).thenReturn(users);
        User user1=new User("Denis");
        assertFalse(dao.findAllUsers().contains(user1));
    }
}