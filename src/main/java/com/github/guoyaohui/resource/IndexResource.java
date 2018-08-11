package com.github.guoyaohui.resource;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

/**
 * @author 郭垚辉
 * @date 2018-08-11
 */
@Path("/")
@Component
public class IndexResource {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public String index(){
        return UUID.randomUUID().toString();
    }
}
