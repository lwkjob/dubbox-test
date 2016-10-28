package com.lwk.jdkspi.iml;

import com.lwk.jdkspi.api.HelloSpi;

/**
 * Created by lwk on 2016/10/27.
 */
public class HelloSpiIml implements HelloSpi {
    public String sayMeiZi(String msg) {
        return "我是服务器:"+msg;
    }
}
