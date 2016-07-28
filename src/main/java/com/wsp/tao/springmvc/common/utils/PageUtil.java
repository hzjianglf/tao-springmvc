package com.wsp.tao.springmvc.common.utils;

import java.util.List;

/**
 * Created by wangshupeng1 on 2016/7/27.
 */
public class PageUtil<T> {

    private static PageUtil page = null;
    private String modelName;   //实体名字,比如User,就是写User
    private int pageNow;        //当前页
    private int pageSize;       //每页显示个数
    private int totalCount;     //总数

    public PageUtil(){

    }

    public PageUtil(Integer pageNow,Integer pageSize){
        this.pageNow =pageNow;
        this.pageSize = pageSize;
    }

    public int getPages() {     //获取总页数
        return totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
