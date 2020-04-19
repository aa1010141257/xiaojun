package com.itheima.dao.impl;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("iUserDao")
public class UserDaoImp implements IUserDao {

    @Autowired
    private QueryRunner query;

    @Override
    public List<User> findAll() {
        try {

            return this.query.query("select * from student", new BeanListHandler<User>(User.class));
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User findUserById(Integer id) {
        try {

            return this.query.query("select * from student where id=?", new BeanHandler<User>(User.class),id);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateAcount(User user) {
        try {

            query.update("update student set name=?,age=? where id=?", user.getName(),user.getAge(),user.getId());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delectAcountById(Integer id) {
        try {

            query.update("delect  from student where id=?", id);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
