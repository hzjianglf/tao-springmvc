package com.wsp.tao.springmvc.entity;

import java.util.List;

/**
 * Created by wangshupeng1 on 2016/7/27.
 */
public class QueryResult<T> {

    private static final long serialVersionUID = 1L;
    private Long allCount;		//总记录条数
    private int allPage;		//总页数
    private int currentPage;	//当前页数
    private int pageSize;		//一页包含的记录条数
    private List<T> resultList;	//查询结果集

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getAllCount() {
        return allCount;
    }

    public void setAllCount(Long allCount) {
        this.allCount = allCount;
    }

    public int getAllPage() {
        return allPage;
    }

    public void setAllPage(int allPage) {
        this.allPage = allPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getResultList() {
        return resultList;
    }

    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }
}
