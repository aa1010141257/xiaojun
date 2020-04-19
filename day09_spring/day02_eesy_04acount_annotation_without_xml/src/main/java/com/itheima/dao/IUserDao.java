package com.itheima.dao;


import com.itheima.domain.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll();

    User findUserById(Integer id);

    void updateAcount(User user);

    void delectAcountById(Integer id);
}
