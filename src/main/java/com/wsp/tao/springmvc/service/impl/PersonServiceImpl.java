package com.wsp.tao.springmvc.service.impl;

import com.wsp.tao.springmvc.dao.PersonDao;
import com.wsp.tao.springmvc.entity.PersonEntity;
import com.wsp.tao.springmvc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangshupeng1 on 2016/7/25.
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public PersonEntity load(String id) {
        return personDao.load(id);
    }

    @Override
    public PersonEntity get(String id) {
        return personDao.get(id);
    }

    @Override
    public List<PersonEntity> findAll() {
        return personDao.findAll();
    }

    @Override
    public void persist(PersonEntity entity) {
        personDao.persist(entity);
    }

    @Override
    public String save(PersonEntity entity) {
        return personDao.save(entity);
    }

    @Override
    public void saveOrUpdate(PersonEntity entity) {
        personDao.saveOrUpdate(entity);
    }

    @Override
    public void delete(String id) {
        personDao.delete(id);
    }

    @Override
    public void flush() {
        personDao.flush();
    }
}
