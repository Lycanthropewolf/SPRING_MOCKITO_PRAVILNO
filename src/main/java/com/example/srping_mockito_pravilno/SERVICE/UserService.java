package com.example.srping_mockito_pravilno.SERVICE;

import com.example.srping_mockito_pravilno.DAO.UserDao;
import com.example.srping_mockito_pravilno.DAO.UserDaoImpl;
import com.example.srping_mockito_pravilno.User;

public class UserService {
    private UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public boolean checkUserExist(User user) {
        if (dao.findAllUsers().contains(user)) {
            return true;
        }
        return false;
    }
}
