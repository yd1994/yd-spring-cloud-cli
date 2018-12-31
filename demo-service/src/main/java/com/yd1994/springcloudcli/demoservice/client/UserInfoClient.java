package com.yd1994.springcloudcli.demoservice.client;

import com.yd1994.springcloudcli.demoservice.dto.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user-service", fallback = UserInfoClientFallback.class)
public interface UserInfoClient {

    @RequestMapping(value = "/user_info/{name}", method = RequestMethod.GET)
    UserInfo getUserInfoByName(@PathVariable("name") String name);

}
