package org.spring.springboot.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class UserRestController {
    @Autowired
    private UserService userService;

    //得到所有用户信息
    @GetMapping("/api/user")
    public List<User> queryAll(){
        return userService.queryAll();
    }


    //根据用户名查找对应用户信息
    @GetMapping("/api/user/{username}")
    public User queryByName(@PathVariable("username") String username){
        return userService.queryByName(username);
    }


    //对前端数据进行匹配
    @GetMapping("/api/user/check")
    public String check(@RequestBody User user){
        return userService.check(user);
    }


    //从Redis缓存中获得当前的用户信息
    @GetMapping("/api/user/getuser")
    public User getuser() throws IOException {
        return userService.getuser();
    }


    //添加用户到数据库中
    @PostMapping("/api/user")
    public Long add(@RequestBody User user) throws JsonProcessingException {
        return userService.add(user);
    }


    //从数据库中删除用户信息
    @PostMapping("/api/user/{username}")
    public Long deleteuser(@PathVariable("username") String username){
        return userService.deleteuser(username);
    }
}
