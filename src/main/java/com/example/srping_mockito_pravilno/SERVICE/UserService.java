package com.example.srping_mockito_pravilno.SERVICE;

import com.example.srping_mockito_pravilno.DAO.UserDaoImpl;
import com.example.srping_mockito_pravilno.User;

public class UserService {
    private final UserDaoImpl userDao;

    public UserService(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public boolean checkUserExist(User user) {
        if (userDao.getAllUsers().contains(user)) {
            return true;
        }
        return false;
    }
}
