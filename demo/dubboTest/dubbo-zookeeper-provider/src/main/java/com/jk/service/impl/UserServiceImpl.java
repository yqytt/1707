package com.jk.service.impl;

import com.jk.dao.UserMapper;
import com.jk.model.Goodgl;
import org.springframework.beans.factory.annotation.Autowired;
import com.jk.model.User;
import com.jk.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 杨棋洋 on 2018/4/3.
 */
@Service("userService")
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;

    public List<User> userList(User user) {
        List<User> userList = userMapper.userList(user);
        return userList;
    }

    public List<Goodgl> goodList(Goodgl goodgl) {
        List<Goodgl> goodList = userMapper.goodList(goodgl);
        return goodList;
    }

    public void deletegoodgl(Integer bb) {
        userMapper.deletegoodgl(bb);
    }
}
