package com.wsp.tao.springmvc.dao.impl;

import com.wsp.tao.springmvc.dao.BaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.Assert;

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

//    @PersistenceContext
//    private EntityManager em;

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

    public Page<T> hqlQueryForPage(String hsql, List<Object> parameters,Pageable pageable) {
            return null;
    }

//    /**
//     * hsql 自动分页
//     *
//     * @param hsql
//     *
//     * @param parameters
//     *            参数
//     * @param pageable
//     *            分页详情
//     * @return 返回分页信息
//     */
//    public Page<T> hqlQueryForPage(String hsql, List<Object> parameters,Pageable pageable) {
//        Query query = this.getCurrentSession().createQuery(hsql);
//        Assert.notNull(parameters);
//        for (int i = 0; i < parameters.size(); i++) {
//            parameters.set(i, parameters.get(i));
//        }
//        if (parameters != null) {
//            for (int i = 0; i < parameters.size(); i++) {
//                query.setParameter(i + 1, parameters.get(i));
//            }
//        }
//
//        return pageable == null ? new PageImpl<T>(query.getResultList()): readPage(query, pageable);
//    }
//
//    /**
//     * 设置分页查询
//     *
//     * @param query
//     *            查询
//     * @param pageable
//     *            分页信息
//     * @return
//     */
//    private Page<T> readPage(Query query, Pageable pageable) {
//
//        query.setFirstResult(pageable.getOffset());
//        query.setMaxResults(pageable.getPageSize());
//
//        int total = 100;
//
//        return new PageImpl<T>(query.getResultList(), pageable, total);
//    }
}
