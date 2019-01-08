package com.yuxiu.edu.mapper.base;

import com.yuxiu.edu.model.User;

/**
 * @author star
 * @date 2019/1/6 0006-17:07
 */
public interface BaseMapper<T> {


    public User findById(Integer id);
    public T findByUUID(String uuid);

    public void deleteById(Integer id);
    public void deleteByUUID(String uuid);

    public void update(T t);

    public void insert(T t);
}
