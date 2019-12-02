package com.mcy.jdbctemplate.controller;

import com.mcy.jdbctemplate.entity.User;
import com.mcy.jdbctemplate.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/insertUser")
    public String insertUser(){
        return "插入数据["+userService.insertUser()+"]条";
    }

    @RequestMapping("/insertGetKey")
    public User insertGetKey(User user){
        return userService.insertGetKey(user);
    }

    @RequestMapping("/selectByUsername")
    public User selectByUsername(String username){
        return userService.selectByUsername(username);
    }

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/update")
    public void update(User user){
        userService.update(user);
    }

    @RequestMapping("/delete")
    public void delete(Integer id){
        userService.delete(id);
    }
}
