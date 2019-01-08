package com.yuxiu.edu.service;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.base.IBaseService;

/**
 * @author star
 * @date 2019/1/6 0006-17:25
 */
public interface IUserService extends IBaseService<User> {

    //特有的方法
    public User login(String username,String password);
}
