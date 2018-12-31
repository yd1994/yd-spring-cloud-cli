package com.yd1994.springcloudcli.userservice.controller;

import com.yd1994.springcloudcli.userservice.dto.UserInfo;
import com.yd1994.springcloudcli.userservice.service.IUserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user_info")
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;

    @RequestMapping("/{name}")
    public ResponseEntity getByName(@PathVariable("name") String name) throws Exception {
        UserInfo userInfo = this.userInfoService.getUserInfoByName(name);
        log.debug("getByName: " + userInfo.toString());
        return ResponseEntity.ok(userInfo);
    }

}
