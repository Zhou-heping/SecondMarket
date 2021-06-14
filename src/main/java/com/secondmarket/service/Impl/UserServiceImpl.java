package com.secondmarket.service.Impl;

import com.secondmarket.controller.RequestBean.UserLoginReq;
import com.secondmarket.controller.ResponseBean.UserResp;
import com.secondmarket.controller.ResponseResult.Result;
import com.secondmarket.entity.User;
import com.secondmarket.mapper.UserMapper;
import com.secondmarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import static com.secondmarket.controller.ResponseResult.Static_CodeMsg.USERNAME_PASSWORD_NOTNULL;
import static com.secondmarket.controller.ResponseResult.Static_CodeMsg.USER_NOT_FOUND_OR_PASSWORDFAILED;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    /**
     * 用户加密和解密
     */
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public Result<UserResp> login(UserLoginReq userLoginReq) {
        String username = userLoginReq.getUsername();
        String password = userLoginReq.getPassword();
        String state = userLoginReq.getState();
        if(state.equals("用户")){
            // 如果用户名和密码为空，返回错误码 1
            if(username == null || password == null ||"".equals(username) ||"".equals(password)||
                    username.trim().equals("")||password.trim().equals("")){
                return Result.error(USERNAME_PASSWORD_NOTNULL);
            }
            User user = userMapper.findUserByUserName(username);
            if(user != null && bCryptPasswordEncoder.matches(password,user.getPassword())) {
                // 将查询到的用户信息返回给前端。返回成功码为 0
                UserResp userResp = new UserResp(user.getId(),user.getUsername(),user.getPhone(),
                        user.getSex(),user.getEmail(),user.getCity(),user.getBanknumber(),user.getMoney());
                return Result.success(userResp);
            }
            // 用户名或者密码错误，返回码为 3
            return Result.error(USER_NOT_FOUND_OR_PASSWORDFAILED);

        }else{
            // 该用户是商家，后续实现

            return null;
        }

    }
}
