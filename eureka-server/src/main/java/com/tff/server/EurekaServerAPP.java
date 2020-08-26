package com.tff.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author fafatuo
 * @version 1.0
 * @date 2020/8/26 16:36
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAPP {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerAPP.class,args);
    }
}
