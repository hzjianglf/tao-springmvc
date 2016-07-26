package com.wsp.tao.springmvc.service;

import com.wsp.tao.springmvc.entity.AcctUser;

import java.util.List;

/**
 * Created by wangshupeng1 on 2016/7/24.
 */
public interface UserService {

    AcctUser load(String id);

    AcctUser get(String id);

    List<AcctUser> findAll();

    void persist(AcctUser entity);

    String save(AcctUser entity);

    void saveOrUpdate(AcctUser entity);

    void delete(String id);

    void flush();
}
