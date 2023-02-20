package com.manman.crm.result;

import com.manman.crm.enums.BaseEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Gaoziman
 * @version 1.0
 * description:
 * @date 2023/2/20 19:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "数据传输对象", description = "")
public class ResultDto {

    @ApiModelProperty("状态码")
    private Integer code;

    @ApiModelProperty("响应消息")
    private String message;

    @ApiModelProperty("响应数据")
    private Object data;

    @ApiModelProperty("token")
    private String token;

    public ResultDto(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultDto(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultDto(BaseEnum e){
        this.code = e.getCode();
        this.message = e.getMessage();
    }

    public ResultDto(BaseEnum e,Object data){
        this.code = e.getCode();
        this.message = e.getMessage();
        this.data = data;
    }

    public ResultDto(BaseEnum e,Object data,String token){
        this.code = e.getCode();
        this.message = e.getMessage();
        this.data = data;
        this.token = token;
    }

}
