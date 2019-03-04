package com.yd1994.springcloudcli.registryadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableAdminServer
@EnableAutoConfiguration
public class RegistryAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryAdminApplication.class, args);
    }

}

