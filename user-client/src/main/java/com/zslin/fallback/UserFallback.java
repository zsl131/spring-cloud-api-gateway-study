package com.zslin.fallback;

import com.zslin.iservice.IUserService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zsl-pc on 2016/8/24.
 */
@Component
public class UserFallback implements IUserService {

    @Override
    public String addUser(@RequestParam(value = "name") String name) {
        return "添加用户失败：name="+name;
    }
}
