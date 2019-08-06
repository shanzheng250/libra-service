package com.shanz.services;

import com.shanz.IUserService;
import com.shanz.constant.Constants;
import com.shanz.dal.entity.User;
import com.shanz.dal.mapper.UserMapper;
import com.shanz.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ClassName UserCoreService
 * @Description: 用户请求核心服务
 * @Author shanz
 * @Date 2019/8/6
 * @Version V1.0
 **/
@Service("userCoreService")
public class UserCoreService implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserRegisterResponse register(UserRegisterRequest userRegisterRequest) {

        User user=new User();
        user.setUsername(userRegisterRequest.getUsername());
        user.setPassword(userRegisterRequest.getPassword());
        user.setMobile(userRegisterRequest.getMobile());
        user.setSex(userRegisterRequest.getSex());
        user.setStatus(Constants.UserConstants.NORMAL_USER_STATUS);
        user.setCreateTime(new Date());
        userMapper.insertSelective(user);

        return null;
    }

    @Override
    public UserLoginResponse login(UserLoginRequest request) {
        return null;
    }

    @Override
    public CheckAuthResponse validToken(CheckAuthRequest request) {
        return null;
    }
}
