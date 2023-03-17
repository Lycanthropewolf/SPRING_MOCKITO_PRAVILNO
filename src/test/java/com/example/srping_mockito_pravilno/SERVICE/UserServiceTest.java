package com.example.srping_mockito_pravilno.SERVICE;

import com.example.srping_mockito_pravilno.DAO.UserDaoImpl;
import com.example.srping_mockito_pravilno.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    private  List<User> users = new ArrayList<>();

    public UserServiceTest(UserService userService) {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    UserDaoImpl userDao;
    @InjectMocks
    UserService userService;

    @Test
    public void UserServiceTestOrTrue(User user) {
        User user1=new User("Dima");
        User user2=new User("Vasya");
        User user3=new User("Petya");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        Mockito.doReturn(true).when(users).checkUserExist();
    }
    @Test
    public void UserServiceTestOrFalse(){

    }
}


