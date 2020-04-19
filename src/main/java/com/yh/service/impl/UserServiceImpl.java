package com.yh.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yh.dao.UserDao;
import com.yh.pojo.User;
import com.yh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public PageInfo<User> findByPage(int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        List<User> allUser = userDao.findAllUser();
        PageInfo<User> pageInfo = new PageInfo<>(allUser);
        return pageInfo;
    }
}
