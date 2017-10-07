package com.bkm.spring.jpa.service.vo.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @ClassName: ApiReuqest
 * @Description: 简单的请求参数类
 * @author Can Liu
 * @date 2017年9月14日 下午1:55:34
 * 
 * @param <T>
 */
@ApiModel("请求参数")
public class ApiRequest<T> {
	@ApiModelProperty("请求数据")
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
