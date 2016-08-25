package com.zslin.controller;

import com.zslin.dao.UserDao;
import com.zslin.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsl-pc on 2016/8/24.
 */
@RestController
@RequestMapping(value="user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value="addUser", method= RequestMethod.GET)
    public String addUser(@RequestParam String name) {
        User user = new User();
        user.setName(name);

        userDao.add(user);

        return "添加用户成功啦~~";
    }
}
