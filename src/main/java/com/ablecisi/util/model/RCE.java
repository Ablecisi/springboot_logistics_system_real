package com.ablecisi.util.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 结果集枚举
 */
@Getter
@NoArgsConstructor
public enum RCE {
    /**
     * 成功  200
     */
    SUCCESS(true, 0, "成功"),
    SUCCESS_FIND(true, 0, "查询成功"),
    //SUCCESS_INSERT(true, 200, "新增成功"),
    SUCCESS_CRUD(true, 0, "更新成功"),
    /**
     * 数据验证有关 -- 3000*
     */
    UN_DATA(false, 30001, "没有数据"),
    PARAM_ERROR(false, 30002, "参数不正确"),
    PARAM_FORMAT_ERROR(false, 30003, "参数数据格式有误"),
    COMMENT_EMPTY(false, 30004, "内容必须填写"),
    CODE_ERROR(false, 30005, "验证码错误"),
    /**
     * 手机号已被注册
     */
    REGISTER_MOBILE_ERROR(false, 30006, "手机号已被注册"),
    EMAIL_CODE_ERROR(false,30007,"邮箱有问题"),
    /**
     * 登录 -- code 4000*开始
     */
    LOGIN_PHONE_ERROR(false, 40001, "手机号码不正确"),
    LOGIN_ACCOUNT_ERROR(false, 40002, "账号不正确"),
    /**
     * 登陆失败
     */
    LOGIN_ERROR(false, 31003, "登录失败,用户名或者密码错误"),
    LOGIN_PASSWORD_ERROR(false, 40004, "密码不正确"),
    /**
     * 该用户已被禁用
     */
    LOGIN_DISABLED_ERROR(false, 40005, "该用户已被禁用"),
    /**
     * 登录相关 token
     */
    TOKEN_EXPIRED_ERROR(false, 40006, "token过期,请重新登录"),
    /**
     * 权限相关  4100*
     */
    LOGIN_AUTH(false, 41001, "NOT_LOGIN"),
    LOGIN_ACL(false, 41002, "没有权限"),
    LOGIN_ACCESS(false, 41003, "权限问题"),
    FETCH_ACCESSTOKEN_FAIL(false, 41004, "获取accessToken失败"),
    FETCH_USERINFO_ERROR(false, 43004, "获取用户信息失败"),
    /**
     * 短信服务 1000
     */
    SMS_SEND_ERROR(false, 10001, "短信发送失败"),
    SMS_SEND_ERROR_BUSINESS_LIMIT_CONTROL(false, 10002, "短信发送过于频繁"),
    /**
     * 文件上传下载 相关错误 5500
     */
    FILE_UPLOAD_ERROR(false, 55001, "文件上传错误"),
    FILE_DELETE_ERROR(false, 55002, "文件刪除错误"),
    EXCEL_DATA_IMPORT_ERROR(false, 55003, "Excel数据导入错误"),
    FILE_UPLOAD_CONTEXT_ERROR(false, 55004, "文件上传格式与要求不符"),
    FILE_UPLOAD_SUFFIX_ERROR(false, 55005, "文件后缀不符合要求"),
    FILE_READ_ERROR(false, 55005, "文件被损坏,不能查看"),
    FILE_DOWN_ERROR(false, 55005, "文件被损坏,不能下载"),
    /* 业务错误 */

    /**
     * 其他 错误信息 5000
     */
    BAD_SQL_GRAMMAR(false, 50001, "sql语法错误"),
    JSON_PARSE_ERROR(false, 50002, "json解析异常"),
    URL_ENCODE_ERROR(false, 50003, "URL编码失败"),
    ILLEGAL_CALLBACK_REQUEST_ERROR(false, 50004, "非法回调请求"),
    GATEWAY_ERROR(false, 50005, "服务不能访问"),
    UNKNOWN_REASON(false, 50006, "未知错误"),
    RUNTIME_EXCEPTION(false, 50007, "服务运行报错,请联系管理员处理"),
    REQUEST_METHOD_ERROR(false, 50008, "请求方式有误"),
    STACK_OVERFLOW_ERROR(false, 50009, "栈溢出"),
    DATA_OCCUPIED_ERROR(false, 50010, "数据被引用不能删除" ),
    RESULT_ERROR(false, 500011, "结果集设置异常");
    private Boolean success;

    private Integer code;

    private String message;

    RCE(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

}
