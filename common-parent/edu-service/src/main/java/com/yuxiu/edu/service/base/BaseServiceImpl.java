package com.yuxiu.edu.service.base;

import com.yuxiu.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author star
 * @date 2019/1/6 0006-17:22
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    //统一管理 dao
    @Autowired
    protected UserMapper userMapper;
}

