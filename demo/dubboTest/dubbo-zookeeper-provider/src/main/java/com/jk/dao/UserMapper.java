package com.jk.dao;

import com.jk.model.Goodgl;
import com.jk.model.User;

import java.util.List;

public interface UserMapper {
    /**
     * 用户列表查询
     * @param user
     */
    public List<User> userList(User user);

    public List<Goodgl> goodList(Goodgl goodgl);

    void deletegoodgl(Integer bb);
}