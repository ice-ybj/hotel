package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.User;

import java.util.List;
public interface UserDao {
    /**
     *获取所有用户
     */
    List<User> queryAll();

    /**
     * 添加用户信息
     */
    Long add(User user);

    /**
     * 查询用户信息
     */
    User queryByName(String username);

    /**
     * 删除用户信息
     */
    Long deleteuser(String username);
}
