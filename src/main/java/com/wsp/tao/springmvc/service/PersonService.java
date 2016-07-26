package com.wsp.tao.springmvc.service;

import com.wsp.tao.springmvc.entity.PersonEntity;

import java.util.List;

/**
 * Created by wangshupeng1 on 2016/7/25.
 */
public interface PersonService {

    PersonEntity load(String id);

    PersonEntity get(String id);

    List<PersonEntity> findAll();

    void persist(PersonEntity entity);

    String save(PersonEntity entity);

    void saveOrUpdate(PersonEntity entity);

    void delete(String id);

    void flush();
    
}
