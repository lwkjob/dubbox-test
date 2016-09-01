package com.yjy.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liwenke on 16/9/1.
 */
@Service("clientService")
public class ClientService {

    @Resource
    HelloService helloService;
    public String sayHello(String msg){
        return helloService.helloString(msg);
    }
}
