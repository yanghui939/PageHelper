package com.yh.dao;

import com.yh.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    public List<User> findAllUser();
}
