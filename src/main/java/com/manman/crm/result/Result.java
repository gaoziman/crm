package com.manman.crm.result;

import com.manman.crm.enums.BaseEnum;
import com.manman.crm.enums.BusinessStatusEnum;

/**
 * @author Gaoziman
 * @version 1.0
 * description: 统一的返回数据
 * @date 2023/2/20 19:24
 */
public class Result {

    public static ResultDto success(){
        return new ResultDto(BusinessStatusEnum.SUCCESS);
    }

    public static ResultDto success(String message){
        return new ResultDto(BusinessStatusEnum.SUCCESS.getCode(), message);
    }

    public static ResultDto success(Object data){
        return new ResultDto(BusinessStatusEnum.SUCCESS,data);
    }

    public static ResultDto success(Object data,String token){
        return new ResultDto(BusinessStatusEnum.SUCCESS,data,token);
    }

    public static ResultDto success(String message, Object data){
        return new ResultDto(BusinessStatusEnum.SUCCESS.getCode(),message,data);
    }

    public static ResultDto error(String message){
        return new ResultDto(BusinessStatusEnum.ERROR.getCode(), message);
    }

    public static ResultDto error(){
        return new ResultDto(BusinessStatusEnum.ERROR);
    }

    public static ResultDto error(Integer code, String message){
        return new ResultDto(code,message);
    }

    public static ResultDto error(BaseEnum e) {
        return new ResultDto(e);
    }
}
