package com.bkm.spring.jpa.common.exception;

/**
 * 异常代码
 */
public enum ErrorCode {

    SUCCESS(200, "成功"),

    /**
     * 系统相关、通用
     */
    ERR_UNKNOWN(701, "未知异常"),
    ERR_SYSTEM(702, "系统异常"),
    ERR_PARAM(703, "参数异常"),
    ERR_TIMEOUT(704, "处理超时"),
    ERR_TIMEOUT_CONNECT(705, "连接超时"),
    ERR_TIMEOUT_SOCKET(706, "链接超时"),

    /**
     * 流程引擎相关
     **/


    /**
     * 业务相关
     **/
    ERR_RPC(801, "RPC请求异常"),;


    private final int code;

    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return Integer.toString(code);
    }

    public int getCode() {
        return this.code;
    }

    public static ErrorCode getByCode(int value) {
        for (ErrorCode _enum : values()) {
            if (_enum.getCode() == value) {
                return _enum;
            }
        }
        return null;
    }
}
