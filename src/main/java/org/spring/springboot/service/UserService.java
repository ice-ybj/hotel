package org.spring.springboot.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.spring.springboot.domain.User;

import java.io.IOException;
import java.util.List;

public interface UserService {
    /**
     *获取所有用户
     */
    List<User> queryAll();

    /**
     * 添加用户信息
     */
    Long add(User user) throws JsonProcessingException;

    /**
     * 查询用户信息
     */
    User queryByName(String username);

    /**
     *核对用户信息
     */
    String check(User user);

    /**
     * 获取用户缓存信息
     */
    User getuser() throws IOException;


    /**
     * 删除用户信息
     */
    Long deleteuser(String username);
}
