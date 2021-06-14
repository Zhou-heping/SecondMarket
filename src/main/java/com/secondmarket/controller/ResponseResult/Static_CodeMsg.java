package com.secondmarket.controller.ResponseResult;

public class Static_CodeMsg {

//通用错误码定义

    // 处理成功消息码
    public static CodeMsg SUCCESS = new CodeMsg(0, "success");

    // 登录验证类错误码
    public static CodeMsg USERNAME_PASSWORD_NOTNULL = new CodeMsg(1, "用户名和密码不能为空！");
    public static CodeMsg USER_NOT_FOUND_OR_PASSWORDFAILED = new CodeMsg(2, "用户名或者密码错误！");
    public static CodeMsg LOGIN_PARAMETERS_ISNULL =  new CodeMsg(3, "传递的参数有误！");


    // 注册失败码
    public static CodeMsg REGISTER_USERNAME_FAILED = new CodeMsg(100, "用户名长度在4-12位！");
    public static CodeMsg REGISTER_PASSWORD_FAILED = new CodeMsg(101, "两次密码要一致，且密码为英文和数字的组合，密码长度在6-16位！");
    public static CodeMsg REGISTER_USERNAME_USED = new CodeMsg(102, "该用户已存在，不能进行注册！");

    // 修改密码失败码
    public static CodeMsg UPDATE_USERNAME_FAILED= new CodeMsg(200, "用户名长度在4-12位，且只能是英文或者数字！");
    public static CodeMsg UPDATE_PASSWORD_FAILED= new CodeMsg(201, "密码长度在6-16位，且密码是字母和汉字的组合");
    public static CodeMsg UPDATE_USER_NOTFOUND =  new CodeMsg(202, "没有查找到该用户");
    public static CodeMsg UPDATE_OLDPASSWORD_NOT_TRUE = new CodeMsg(203, "原密码不正确！");

    // 删除用户失败码
    public static CodeMsg DELETE_USERNAME_ISNULL= new CodeMsg(300, "用户名为空！");
    public static CodeMsg DELETE_USER_FAILED= new CodeMsg(301, "删除用户失败！");

}
