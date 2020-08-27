package com.tff.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author fafatuo
 * @version 1.0
 * @date 2020/8/26 17:05
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAPPA {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerAPPA.class,args);
    }
}
