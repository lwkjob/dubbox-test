package com.yjy.service;

import org.springframework.stereotype.Service;

/**
 * Created by lwk on 2016/10/28.
 */
@Service("helloService2")
public class HelloService2Impl implements HelloService {
    @Override
    public String helloString(String msg) {
        return "我是2:"+msg;
    }
}
