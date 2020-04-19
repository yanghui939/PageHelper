package com.yh.service;

import com.github.pagehelper.PageInfo;
import com.yh.pojo.User;

public interface UserService {

    public PageInfo<User> findByPage(int pageIndex,int pageSize);
}
