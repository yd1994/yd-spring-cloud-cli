package com.yd1994.springcloudcli.demoservice.controller;

import com.yd1994.springcloudcli.demoservice.client.UserInfoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserInfoClient userInfoClient;

    @GetMapping("/user_info/{name}")
    public ResponseEntity getUserInfo(@PathVariable("name") String name) {
        return ResponseEntity.ok(this.userInfoClient.getUserInfoByName(name));
    }

}
