package com.yjy.service;

import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.stereotype.Service;

/**
 * Created by liwenke on 16/8/31.
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String helloString(String msg) {
        return RpcContext.getContext().getLocalAddressString()+ msg+ RpcContext.getContext().getRemoteAddressString();
    }
}
