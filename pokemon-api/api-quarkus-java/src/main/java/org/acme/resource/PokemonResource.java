package org.acme.resource;

import org.acme.entity.Pokemon;
import org.acme.service.PokemonService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("pokemon")
@Produces(MediaType.APPLICATION_JSON)
public class PokemonResource {

    @Inject
    PokemonService pokemonService;

    @GET
    @Path("{id}")
    public Response getById(Long id) {
        var pokemon = pokemonService.findByIdOrThrow(id);
        return Response.ok(pokemon).build();
    }

    @GET
    @Path("identifier/{identifier}")
    public Response getByIdentifier(String identifier) {
        var pokemon = pokemonService.findByIdentifierOrThrow(identifier);
        return Response.ok(pokemon).build();
    }

}
