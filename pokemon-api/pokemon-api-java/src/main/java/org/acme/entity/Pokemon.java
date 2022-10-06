package org.acme.entity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("")
@Produces(MediaType.APPLICATION_JSON)
public class Pokemon {

    @GET
    @Path("{id}")
    public Response get(int id) {
        String format = "pokemon! id: %s".formatted(id);
        return Response.ok(format).build();
    }
}
