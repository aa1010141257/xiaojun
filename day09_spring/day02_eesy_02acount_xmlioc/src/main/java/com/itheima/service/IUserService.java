package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    User findUserById(Integer id);

    void updateAcount(User user);

    void delectAcountById(Integer id);
}
