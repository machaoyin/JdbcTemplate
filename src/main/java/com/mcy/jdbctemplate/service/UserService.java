package com.mcy.jdbctemplate.service;

import com.mcy.jdbctemplate.entity.User;
import com.mcy.jdbctemplate.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    //注入UserRepository
    @Resource
    private UserRepository userRepository;

    public Integer insertUser(){
        return userRepository.insertUser();
    }

    public User selectByUsername(String username){
        return userRepository.selectByUsername(username);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User insertGetKey(User user){
        return userRepository.insertGetKey(user);
    }

    public void update(User user){
        userRepository.update(user);
    }

    public void delete(Integer id){
        userRepository.delete(id);
    }
}
