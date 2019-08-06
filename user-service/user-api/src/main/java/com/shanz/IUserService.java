package com.shanz;

import com.shanz.dto.*;

/**
 * @ClassName IUserService
 * @Description: 用户服务请求
 * @Author shanz
 * @Date 2019/8/5
 * @Version V1.0
 **/
public interface IUserService {

    /**
     * 用户注册
     * @param userRegisterRequest
     * @return
     */
    UserRegisterResponse register(UserRegisterRequest userRegisterRequest);

    /**
     * 用户登录
     * @param request
     * @return
     */
    UserLoginResponse login(UserLoginRequest request);


    /**
     * 校验过程
     * @param request
     * @return
     */
    CheckAuthResponse validToken(CheckAuthRequest request);

}
