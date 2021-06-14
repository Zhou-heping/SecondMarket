package com.secondmarket.controller.ResponseBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResp {
    // id,数据库自增
    private Integer id;
    // 用户名,不能重复
    private String username;
    // 电话号码，不能重复
    private String phone;
    // 性别
    private String sex;
    // 邮箱
    private String email;
    // 城市
    private String city;
    // 银行账号（16为数字）
    private String banknumber;
    // 钱包
    private Double money;
}

