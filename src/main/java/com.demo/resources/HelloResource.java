package com.demo.resources;

import com.demo.api.Greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting hello(@QueryParam("name") String name) {
        if (name == null) {
            name = "anonymous";
        }

        String greeting = String.format("Hello %s", name);
        return new Greeting(greeting);
    }
}
