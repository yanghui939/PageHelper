package com.yh.controller;

import com.github.pagehelper.PageInfo;
import com.yh.pojo.User;
import com.yh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findByPage")
    public PageInfo<User> findByPage(int pageIndex,int pageSize){
        PageInfo<User> pageInfo = userService.findByPage(pageIndex, pageSize);
        return pageInfo;
    }
}
