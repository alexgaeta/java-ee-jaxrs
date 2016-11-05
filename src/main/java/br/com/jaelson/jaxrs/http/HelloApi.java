package br.com.jaelson.jaxrs.http;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by jaels on 31/10/2016.
 */

@Stateless
@Path("hello")
public class HelloApi {

    @GET
    public String hello(){
        return "hello api";
    }
}
