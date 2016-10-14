package com.yjy.service;

import com.alibaba.dubbo.config.support.Parameter;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by liwenke on 16/9/1.
 */
@Service("restHello")
public class RestHelloImpl implements RestHello {


    public String sayRestHello(String msg) {
        return RpcContext.getContext().getLocalAddressString()+" "+ msg+" 服务端是我";
    }
}
