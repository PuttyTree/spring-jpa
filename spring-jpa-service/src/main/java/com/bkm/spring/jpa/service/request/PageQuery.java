package com.bkm.spring.jpa.service.request;

import io.swagger.annotations.ApiModelProperty;

/**
 * 分页查询
 *
 */
public class PageQuery {

	@ApiModelProperty(value = "页码（从1开始）", required = true)
	protected int pageNo = 1;

	@ApiModelProperty(value = "每页数量", required = true)
	protected int pageSize = 10;

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo == 0 ? 1 : pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
