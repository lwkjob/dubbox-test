package com.lwk.jdkspitest;

import com.lwk.jdkspi.api.HelloSpi;

import java.util.ServiceLoader;

/**
 * Created by lwk on 2016/10/27.
 */
public class TestSpi {

    public static void main(String[] args) {
        ServiceLoader<HelloSpi> spis=  ServiceLoader.load(HelloSpi.class);
            for (HelloSpi spi:spis){
                System.out.println( spi.sayMeiZi("妹子"));
            }
    }
}
