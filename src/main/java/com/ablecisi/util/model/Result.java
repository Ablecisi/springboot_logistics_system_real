package com.ablecisi.util.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;

/**
 * 结果集类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private Boolean success;
    private Integer code;//500  200
    private Object data;//String  List  Map  User  json
    private String msg;
    //count

    /**
     *  成功
     * @return
     */
    public static Result success() {
        Result result = new Result();
        result.setSuccess(RCE.SUCCESS.getSuccess());
        result.setCode(RCE.SUCCESS.getCode());
        result.setMsg(RCE.SUCCESS.getMessage());
        return result;
    }

    public static Result success(Object obj) {
        Result result = new Result();
        result.setSuccess(RCE.SUCCESS.getSuccess());
        result.setCode(RCE.SUCCESS.getCode());
        result.setMsg(RCE.SUCCESS.getMessage());
        result.setData(obj);
        return result;
    }

    /**
     * 功能描述：失败返回
     *
     * @return ResultData 失败返回结果
     * @author hly
     * @date 2020/11/16
     */
    public static Result error() {
        Result result = new Result();
        result.setSuccess(RCE.UNKNOWN_REASON.getSuccess());
        result.setCode(RCE.UNKNOWN_REASON.getCode());
        result.setMsg(RCE.UNKNOWN_REASON.getMessage());
        return result;
    }

    /**
     *     * 功能描述：失败返回
     *      *
     *      * @return ResultData 失败返回结果
     * @param resultCodeEnum 填入  枚举
     * @return
     */
    public static Result error(RCE resultCodeEnum) {
        Result result = new Result();
        result.setSuccess(resultCodeEnum.getSuccess());
        result.setCode(resultCodeEnum.getCode());
        result.setMsg(resultCodeEnum.getMessage());
        return result;
    }

    /**
     * 功能描述：设置返回结果
     *
     * @param resultCodeEnum 结果枚举
     * @return ResultData 返回给前端的结果
     * @author hly
     * @date 2020/11/16
     */
    public static Result success(RCE resultCodeEnum) {
        Result result = new Result();
        result.setSuccess(resultCodeEnum.getSuccess());
        result.setCode(resultCodeEnum.getCode());
        result.setMsg(resultCodeEnum.getMessage());
        return result;
    }

    /**
     * 功能描述：设置success状态
     *
     * @param success 值为true或false
     * @return ResultData
     * @author hly
     * @date 2020/11/16
     */
    public Result success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    /**
     * 功能描述：设置message内容
     *
     * @param message 消息内容
     * @return ResultData 返回给前端的数据
     * @author hly
     * @date 2020/11/16
     */
    public Result msg(String message) {
        this.setMsg(message);
        return this;
    }

    /**
     * 功能描述：设置code内容
     *
     * @param code 返回码
     * @return ResultData 返回给前端的数据
     * @author hly
     * @date 2020/11/16
     */
    public Result code(Integer code) {
        this.setCode(code);
        return this;
    }

    /**
     * 功能描述：单值设置数据
     *
     * @param key   键
     * @param value 值
     * @return ResultData 返回给前端的数据  data:  Map
     * @author hly
     * @date 2020/11/16
     */
    public Result addData(String key, Object value) {
        if(this.data  instanceof HashMap ){
            ((HashMap) data).put(key, value);
        }else if(this.data==null){
            HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
            objectObjectHashMap.put(key, value);
            this.data=objectObjectHashMap;
        }else if(this.data!=null && !(this.data  instanceof HashMap)){
           // throw  new BizSystemException(RCE.RESULT_ERROR);
            System.err.println("输入的格式有问题");
            return  null;
        }
        return this;
    }

    /**
     * 功能描述：多值设置数据
     *
     * @param obj 集合
     * @return ResultData 返回给前端的数据
     * @author hly
     * @date 2020/11/16
     */
    public Result data(Object  obj) {
        this.setData(obj);
        return this;
    }



}
