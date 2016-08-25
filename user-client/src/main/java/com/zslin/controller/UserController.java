package com.zslin.controller;

import com.zslin.iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsl-pc on 2016/8/24.
 */
@RestController
@RequestMapping(value="user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value="addUser", method= RequestMethod.GET)
    public String addUser(String name) {

        return userService.addUser(name);
    }
}
