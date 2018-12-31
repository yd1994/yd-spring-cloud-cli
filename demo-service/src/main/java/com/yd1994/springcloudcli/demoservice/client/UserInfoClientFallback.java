package com.yd1994.springcloudcli.demoservice.client;

import com.yd1994.springcloudcli.demoservice.dto.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserInfoClientFallback implements UserInfoClient {

    @Override
    public UserInfo getUserInfoByName(String name) {
        log.warn("getUserInfoByName() Fallback");
        return null;
    }

}
