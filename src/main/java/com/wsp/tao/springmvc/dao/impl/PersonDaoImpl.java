package com.wsp.tao.springmvc.dao.impl;

import com.wsp.tao.springmvc.dao.PersonDao;
import com.wsp.tao.springmvc.entity.PersonEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangshupeng1 on 2016/7/25.
 */
@Repository("personDao")
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public PersonEntity load(String id) {
        return (PersonEntity) this.getCurrentSession().load(PersonEntity.class, id);
    }

    public PersonEntity get(String id) {
        return (PersonEntity) this.getCurrentSession().get(PersonEntity.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<PersonEntity> findAll() {
        List<PersonEntity> personList = this.getCurrentSession().createQuery("from PersonEntity").setCacheable(true).list();
        return personList;
    }

    public void persist(PersonEntity entity) {
        this.getCurrentSession().persist(entity);
    }

    public String save(PersonEntity entity) {
        return (String) this.getCurrentSession().save(entity);
    }

    public void saveOrUpdate(PersonEntity entity) {
        this.getCurrentSession().saveOrUpdate(entity);
    }

    public void delete(String id) {
        PersonEntity entity = this.load(id);
        this.getCurrentSession().delete(entity);
    }

    public void flush() {
        this.getCurrentSession().flush();
    }
}
