package com.secondmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author peace
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Business {

    // 商家id,数据库自增
    private Integer businessId;
    // 店铺名
    private String marketName;
    // 营业执照照片
    private Byte[] businessLicense;
    // 银行账号
    private String businessBank;
    // 姓名，唯一
    private String businessName;
    // 电话号码，11位，唯一
    private String businessPhone;
    // 身份证，18位
    private String idCard;
    // 审核状态，审核通过后才可以使用，有3个值，审核中，正常，未通过
    private String businessState;
    // 商家钱包
    private Double bussinessMoney;
}
