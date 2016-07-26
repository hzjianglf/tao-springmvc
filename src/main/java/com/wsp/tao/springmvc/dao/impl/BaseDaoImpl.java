package com.wsp.tao.springmvc.dao.impl;

import com.wsp.tao.springmvc.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

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

    public T find(ID id) {
        if (id != null) {
            return (T)this.getCurrentSession().get(entityClass, id);
        }
        return null;
    }

    public void persist(T entity) {
        Assert.notNull(entity);
        this.getCurrentSession().persist(entity);
    }

    public T merge(T entity) {
        Assert.notNull(entity);
        return (T)this.getCurrentSession().merge(entity);
    }

    public void remove(T entity) {
        if (entity != null) {
            this.getCurrentSession().delete(entity);
        }
    }

    public void refresh(T entity) {
        if (entity != null) {
            this.getCurrentSession().refresh(entity);
        }
    }
}
