package com.yjy.service;

import com.alibaba.dubbo.config.support.Parameter;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by liwenke on 16/9/1.
 */
@Path("restHello")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Service("restHello")
public class RestHelloImpl implements RestHello {

    @GET
    @Path("{msg: \\d+}")
    public String sayRestHello(@PathParam("msg") String msg) {
        return msg+"服务端是我";
    }
}
