package org.spring.springboot.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.spring.springboot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.io.IOException;
import java.security.Key;
import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    private static final String KEY = "users";
    @Autowired
    private UserDao userDao;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Override
    public Long add(User user) throws JsonProcessingException {
        // 将rankList序列化后写入Reidis
        ObjectMapper mapper = new ObjectMapper();
        redisTemplate.opsForValue().set(KEY, mapper.writeValueAsString(user));
        return userDao.add(user);
    }

    public User getuser() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(redisTemplate.opsForValue().get(KEY), User.class);
    }

    @Override
    public User queryByName(String username) {
        return userDao.queryByName(username);
    }


    @Override
    public String check(User user) {
        Long flag = new Long((long)0);
        List<User> userslist = userDao.queryAll();
        User usercheck = userDao.queryByName(user.getAccount());
        if(null == usercheck){return "账号错误，请重新输入！";}
        for(User x : userslist){
            if(user.getAccount().equals(x.getAccount())){
                if(!user.getPassword().equals(x.getPassword())) {
                    return "密码错误,请重新输入！";
                }else {
                    return "登陆成功！";
                }
            }
        }
        return "0000";
    }

    public Long deleteuser(String username){
        return userDao.deleteuser(username);
    }

}
