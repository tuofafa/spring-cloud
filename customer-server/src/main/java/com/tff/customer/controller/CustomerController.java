package com.tff.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author fafatuo
 * @version 1.0
 * @date 2020/8/27 9:38
 */
@RestController
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(name = "customer",method = RequestMethod.GET)
    public String hello(){
       return restTemplate.getForEntity("http://PROVIDER-SERVER/index",String.class).getBody();
    }
}
