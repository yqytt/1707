package com.jk.service;

import com.jk.model.Goodgl;
import com.jk.model.User;

import java.util.List;

/**
 * Created by 杨棋洋 on 2018/4/3.
 */
public interface IUserService {


    /**
     * 用户列表查询
     * @param user
     * @return
     */
    public List<User> userList(User user);

    public List<Goodgl> goodList(Goodgl goodgl);

    void deletegoodgl(Integer bb);

}
