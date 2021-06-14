package com.secondmarket.controller.RequestBean;

import lombok.Data;

@Data
public class UserRegisterReq {

    /**
     * 用户名，密码，是否为管理员
     */
    private String username;
    private String password;
    private String level;
}


