package com.tff.provier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author fafatuo
 * @version 1.0
 * @date 2020/8/26 17:14
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderServerAPP {
    public static void main(String[] args) {
        SpringApplication.run(ProviderServerAPP.class,args);
    }

}
