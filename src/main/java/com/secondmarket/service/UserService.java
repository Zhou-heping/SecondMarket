package com.secondmarket.service;

import com.secondmarket.controller.RequestBean.UserLoginReq;
import com.secondmarket.controller.ResponseBean.UserResp;
import com.secondmarket.controller.ResponseResult.Result;

public interface UserService {
    /**
     * 用户登录服务
     * UserLoginReq: username（用户名）, password(密码), level（身份）
     */
    public Result<UserResp> login(UserLoginReq userLoginReq);



}
