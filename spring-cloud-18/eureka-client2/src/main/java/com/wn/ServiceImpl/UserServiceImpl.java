package com.wn.ServiceImpl;

import com.wn.entity.User;
import com.wn.mapper.UserMapper;

import com.wn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    public User UserInfo(String name) {
        return  userMapper.UserInfo(name);
    }

    @Override
    public void save(User user) {
       if(user!=null){
           userMapper.insert(user);
       }
    }

}
