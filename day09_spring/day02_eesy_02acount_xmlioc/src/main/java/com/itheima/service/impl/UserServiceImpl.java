package com.itheima.service.impl;


import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import com.itheima.service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {

    private IUserDao iUserDao;

    @Override
    public List<User> findAll() {
        return iUserDao.findAll();
    }

    @Override
    public User findUserById(Integer id) {
        return iUserDao.findUserById(id);
    }

    @Override
    public void updateAcount(User user) {
        iUserDao.updateAcount(user);
    }

    @Override
    public void delectAcountById(Integer id) {
        iUserDao.delectAcountById(id);
    }

    public IUserDao getiUserDao() {
        return iUserDao;
    }

    public void setiUserDao(IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }
}
