package com.ruanko.springboothelloworld.service.Impl;

import com.ruanko.springboothelloworld.entity.User;
import com.ruanko.springboothelloworld.mapper.UserMapper;
import com.ruanko.springboothelloworld.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public boolean checkLogin(String userName, String passWord) {
        if(userName == null || userName.equals("")){
            return false;
        }
        User user = userMapper.selectUserByName(userName);
        if (user == null){
            return false;
        }
        if(!user.getPassWord().equals(passWord)){
            return false;
        }
        return true;
    }
}
