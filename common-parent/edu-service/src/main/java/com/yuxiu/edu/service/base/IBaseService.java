package com.yuxiu.edu.service.base;

/**
 * @author star
 * @date 2019/1/6 0006-17:19
 */
public interface IBaseService<T> {

    public T findById(Integer id);
    public T findByUUID(String uuid);

    public void deleteById(Integer id);
    public void deleteByUUID(String uuid);

    public void update(T t);

    public void insert(T t);
}
