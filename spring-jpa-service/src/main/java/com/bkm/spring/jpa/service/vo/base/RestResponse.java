package com.bkm.spring.jpa.service.vo.base;


import com.bkm.spring.jpa.common.exception.ErrorCode;

/**
 * 标准结果返回
 */
public class RestResponse<T> {
	private Integer code;

	private String message;

	private T data;


	public RestResponse(Integer code, String message) {
		this.code = code;
		this.message = message;
		this.data = null;
	}

	public RestResponse(Integer code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public RestResponse(ErrorCode errorCode, T data) {
		this.code = errorCode.getCode();
		this.message = errorCode.getMessage();
		this.data = data;
	}

	public static <T> RestResponse<T> success(T data) {
		return new RestResponse<T>(ErrorCode.SUCCESS, data);
	}

	public static RestResponse<?> fail(ErrorCode errorCode) {
		return new RestResponse<>(errorCode, null);
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
