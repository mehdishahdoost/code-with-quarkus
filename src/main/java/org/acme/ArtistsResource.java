package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.UUID;

@Path("/artists")
public class ArtistsResource {

    private List<Artist> artists = List.of(
            new Artist(UUID.randomUUID(), "Erik", "Ventura"),
            new Artist(UUID.randomUUID(), "Emannul", "Ventura"),
            new Artist(UUID.randomUUID(), "Maike", "Ventura")
    );


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getArtists() {
        return Response.ok(artists).build();
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getArtistsCount() {
        return Response.ok(artists.size()).build();
    }

}
