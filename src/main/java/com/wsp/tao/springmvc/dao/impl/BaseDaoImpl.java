package com.wsp.tao.springmvc.dao.impl;

import com.sun.org.apache.regexp.internal.REUtil;
import com.wsp.tao.springmvc.dao.BaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by wangshupeng1 on 2016/7/26.
 */
public abstract class BaseDaoImpl<T, ID extends Serializable> implements BaseDao<T, ID> {

    /** 实体类类型 */
    private Class<T> entityClass;

    /** 别名数 */
    private static volatile long aliasCount = 0;

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public BaseDaoImpl() {
        Type type = getClass().getGenericSuperclass();
        Type[] parameterizedType = ((ParameterizedType) type).getActualTypeArguments();
        entityClass = (Class<T>) parameterizedType[0];
    }

    public void save(T entity) {
        Assert.notNull(entity);
        this.getCurrentSession().persist(entity);
    }

    public void remove(T entity) {
        if (entity != null) {
            this.getCurrentSession().delete(entity);
        }
    }

    public void update(T entity){
        if (entity != null) {
            this.getCurrentSession().update(entity);
        }
    }


    public T find(ID id) {
        if (id != null) {
            return (T)this.getCurrentSession().get(entityClass, id);
        }
        return null;
    }

    public List<T> createQuery(String query){
        Query queryResult = this.getCurrentSession().createQuery(query);
        List<T> list = queryResult.list();
        return  list;
    }

    public List<T> createSqlQuery(String querySql){
        Query queryResult = this.getCurrentSession().createSQLQuery(querySql);
        List<T> list = queryResult.list();
        return  list;
    }
}
