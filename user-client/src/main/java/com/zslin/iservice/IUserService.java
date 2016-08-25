package com.zslin.iservice;

import com.zslin.fallback.UserFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zsl-pc on 2016/8/24.
 */
@FeignClient(serviceId = "user-service", path = "user", fallback = UserFallback.class)
public interface IUserService {

    @RequestMapping(value="addUser", method= RequestMethod.GET)
    public String addUser(@RequestParam(value="name") String name) ;
}
