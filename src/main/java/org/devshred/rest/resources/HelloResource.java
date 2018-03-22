package org.devshred.rest.resources;

import com.wordnik.swagger.annotations.*;
import org.devshred.rest.model.Greeting;
import org.devshred.rest.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by lichao on 2018/3/21.
 */
@Api(value = "/hello", description = "Greeting stuff")
@Path("/hello")
public class HelloResource {

    @Autowired
    GreetingService greetingService;

    @ApiOperation(value = "Default greeting", notes = "Greetings for the rest of us", response = Greeting.class)
    @GET
    public Response sendGreeting() {
        return Response.status(200).entity(greetingService.greeting()).build();
    }

    @ApiOperation(value = "Personalized greeting", notes = "Greetings, hotter than hell", response = Greeting.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid name supplied"),
            @ApiResponse(code = 404, message = "Name not found")
    })
    @GET
    @Path("/{name}/")
    public Response sendGreeting(
            @ApiParam(value = "name of the person to greet", required = true)
            @PathParam("name") final String name) {
        return Response.status(200).entity(greetingService.greeting(name)).build();
    }
}
