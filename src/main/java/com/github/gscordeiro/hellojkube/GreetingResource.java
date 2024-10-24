package com.github.gscordeiro.hellojkube;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return getMessage();
    }

    //https://www.youtube.com/watch?v=0ivU7ElkeBo
    private String getMessage(){
        String msg = System.getenv("HELLO_MSG");
        return msg != null ? msg : "Hello from Quarkus REST";
    }
}
