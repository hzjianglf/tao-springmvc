package com.wsp.tao.springmvc.service.impl;

import com.wsp.tao.springmvc.dao.UserDao;
import com.wsp.tao.springmvc.entity.AcctUser;
import com.wsp.tao.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wangshupeng1 on 2016/7/24.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public AcctUser load(String id) {
        return userDao.load(id);
    }

    @Override
    public AcctUser get(String id) {
        return userDao.get(id);
    }

    @Override
    public List<AcctUser> findAll() {
        return userDao.findAll();
    }

    @Override
    public void persist(AcctUser entity) {
        userDao.persist(entity);
    }

    @Override
    public String save(AcctUser entity) {
        return userDao.save(entity);
    }

    @Override
    public void saveOrUpdate(AcctUser entity) {
        userDao.saveOrUpdate(entity);
    }

    @Override
    public void delete(String id) {
        userDao.delete(id);
    }

    @Override
    public void flush() {
        userDao.flush();
    }

}
