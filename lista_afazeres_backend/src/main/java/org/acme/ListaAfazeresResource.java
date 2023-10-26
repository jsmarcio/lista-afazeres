package org.acme;

import io.quarkus.logging.Log;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.acme.model.ListaAfazeres;
import org.acme.model.StatusResponse;
import org.acme.services.ListaAfazeresService;

@Path("/lista-afazeres")
public class ListaAfazeresResource {

    @Inject
    ListaAfazeresService listaAfazeresService;

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response createItemAfazeres(ListaAfazeres listaAfazeres) {
        Log.debug("Retornando objeto persistido.");
        return Response.ok(listaAfazeresService.createItemAfazeres(listaAfazeres)).build();
    }

    @GET
    @Path("/test")
    public Response getHello() {
        Log.debug("Retornando objeto de teste.");
        return Response.ok(new StatusResponse(200, "Ok!")).build();
    }
}
