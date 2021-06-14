package com.secondmarket.controller.CommanUser;

import com.secondmarket.controller.RequestBean.UserLoginReq;
import com.secondmarket.controller.ResponseBean.UserResp;
import com.secondmarket.controller.ResponseResult.Result;
import com.secondmarket.service.Impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.secondmarket.controller.ResponseResult.Static_CodeMsg.LOGIN_PARAMETERS_ISNULL;

@RestController
@Slf4j
@RequestMapping("comman")
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping("login")
    public Result<UserResp> login(@RequestBody UserLoginReq userLoginReq){
        // 如果接受的参数不为空，才能进行登录操作
        if(userLoginReq != null) {
            log.info("username is:" + userLoginReq.toString());
            return  userService.login(userLoginReq);
        }
        // 传递参数有误，无法接受到有效的数据，错误码4
        return Result.error(LOGIN_PARAMETERS_ISNULL);
    }





}
