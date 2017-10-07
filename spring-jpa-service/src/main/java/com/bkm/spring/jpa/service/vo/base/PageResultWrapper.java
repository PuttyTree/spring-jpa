package com.bkm.spring.jpa.service.vo.base;

import java.util.List;

/**
 * 页面包装类
 *
 */
public class PageResultWrapper<T> {
    /** 总条数*/
    private Long total;

    /** 记录*/
    private List<T> rows;

    /** 每页包含数量*/
    private Integer pageSize;

    /** 当前页数*/
    private Integer pageNo;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }
}
