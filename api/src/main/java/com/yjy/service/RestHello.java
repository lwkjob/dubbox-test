package com.yjy.service;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by liwenke on 16/9/1.
 */

@Path("restHello")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface RestHello {

    @POST
    @Path("{msg: \\S+}")
    String sayRestHello(@PathParam("msg") String msg);
}
