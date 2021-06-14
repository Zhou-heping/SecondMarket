package com.secondmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author peace
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
// 普通用户信息表
public class User implements Serializable {

    // id,数据库自增
    private Integer id;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 电话号码
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
