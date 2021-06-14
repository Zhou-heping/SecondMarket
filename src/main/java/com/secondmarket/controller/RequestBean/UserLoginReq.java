package com.secondmarket.controller.RequestBean;

import lombok.Data;

@Data
public class UserLoginReq {

    /**
     * 用户名，密码，身份
     */
    private String username;
    private String password;
    private String state;


}
