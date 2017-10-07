package com.bkm.spring.jpa.common.exception;

/**
 * 异常代码 
 */
public enum ErrorCode {

    SUCCESS(200, "成功"),

    /** 系统相关、通用 */
    ERR_UNKNOWN(701, "未知异常"), ERR_SYSTEM(702, "系统异常"), ERR_PARAM(703, "参数异常"), ERR_TIMEOUT(704,
            "处理超时"), ERR_TIMEOUT_CONNECT(705, "连接超时"), ERR_TIMEOUT_SOCKET(706, "链接超时"),

    /** 流程引擎相关 **/
    CAMUNDA_ERR_TASK_VARIABLE_TYPE(720, "任务变量类型错误"), CAMUNDA_NULL_TASK_WFC(721, "任务流程代码为空"), CAMUNDA_ERROR_TASK_WFC(722,
            "任务流程代码不合法"), CAMUNDA_PROCESS_NOT_EXIST(723, "流程不存在"), CAMUNDA_TASK_NOT_EXIST(724, "任务不存在"),

    /** 业务相关 **/
    ERR_RPC(801, "RPC请求异常"), DUPLICATE_APPLY(802, "重复申请单"), ERR_APPLY_STATUS(803, "申请单状态不匹配"), ERR_ORG_TYPE(804,
            "组织机构类型不匹配"), APPLY_NO_NOT_EXIST(805, "申请单号不存在"), NULL_RETAILER_TASK(806, "商户任务不存在"), NULL_POS_TASK(807,
                    "门店任务不存在"), TASK_NOT_EXIST(808, "任务不存在"), NO_CLAIMABLE_TASK(809, "没有可领取的任务"), RETAILER_NOT_EXIST(
                            810, "商户不存在"), POS_NOT_EXIST(811, "门店不存在"), MOBILE_POS_NOT_EXIST(812, "移动门店不存在"),

    ;
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
