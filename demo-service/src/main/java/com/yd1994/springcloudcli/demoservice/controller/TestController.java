package com.yd1994.springcloudcli.demoservice.controller;

import com.yd1994.springcloudcli.demoservice.client.UserInfoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserInfoClient userInfoClient;

    @Value("${testconfig}")
    private String configMsg;

    @PreAuthorize("#oauth2.hasAnyScope('server', 'client') and hasAuthority('admin')")
    @GetMapping("/user_info/{name}")
    public ResponseEntity getUserInfo(@PathVariable("name") String name) {
        return ResponseEntity.ok(this.userInfoClient.getUserInfoByName(name));
    }

    @GetMapping("/testconfig")
    public ResponseEntity getConfig() {
        return ResponseEntity.ok(this.configMsg);
    }

}
