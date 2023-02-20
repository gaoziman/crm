package com.manman.crm.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author gaoziman
 * @Date 2023/3/21
 * @Version 1.0
 */

@Getter
@AllArgsConstructor
public enum PayStatusEnum implements BaseEnum {

    PAY_NO(0, "未支付"),
    PAY_YES(1, "已支付"),
    PAY_FAIl(2, "支付失败");

    @EnumValue
    private final Integer code;
    @JsonValue
    private final String message;
}
