package com.project.miaosha.service;

import com.project.miaosha.error.BusinessException;
import com.project.miaosha.service.model.UserModel;
import org.springframework.stereotype.Service;

/**
 * @author Fang Hongxin Email:3170104126@zju.edu.cn
 * @date 2022-07-01 8:44
 * @Description
 */

public interface UserService {
    //通过用户ID获取用户对象的方法
    UserModel getUserById(Integer id);
    //用户注册
    void register(UserModel userModel) throws BusinessException;
    /*
    telphone:用户注册手机
    encrptPassowrd:用户加密后的密码
    */
    UserModel validateLogin(String telephone, String encrptPassword) throws BusinessException;
}
