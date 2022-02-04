package main.java.com.gonkables.controller;

import com.gonkables.service.TestService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/test")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GET
    @Path("/hola")
    public Response holaMundo(){
        return Response.ok(testService.hola()).build();
    }

    @GET
    @Path("/conflict")
    public Response conflictException(){
        return Response.ok(testService.conflictException()).build();
    }

    @GET
    @Path("/notfound")
    public Response notFoundException(){
        return Response.ok(testService.notFoundException()).build();
    }

    @GET
    @Path("/nullpointer")
    public Response nullPointerException(){
        return Response.ok(testService.nullPointerException()).build();
    }

    @GET
    @Path("/exception")
    public Response exception() throws Exception {
        return Response.ok(testService.exception()).build();
    }
}
