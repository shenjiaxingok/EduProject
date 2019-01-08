package com.yuxiu.edu.service.impl;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.IUserService;
import com.yuxiu.edu.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author star
 * @date 2019/1/6 0006-17:30
 */
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService{


    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return  userMapper.findById(id);
    }

    @Override
    public User findByUUID(String uuid) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void insert(User user) {

    }
}
