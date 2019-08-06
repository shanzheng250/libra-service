package com.shanz.dal.mapper;

import com.shanz.dal.entity.User;

/**
 * @ClassName UserMapper
 * @Description: TODO
 * @Author shanz
 * @Date 2019/8/6
 * @Version V1.0
 **/
public interface UserMapper {

    /**
     *
     * @return
     */
    User getUserByUserName(String userName);

    /**
     * 根据uid获取用户信息
     * @param uid
     * @return
     */
    User getUserByUid(Integer uid);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int insertSelective(User user);

}
