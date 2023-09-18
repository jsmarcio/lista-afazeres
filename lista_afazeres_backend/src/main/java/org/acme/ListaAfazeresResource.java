package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.model.ListaAfazeres;
import org.acme.services.ListaAfazeresService;

@Path("/lista-afazeres")
public class ListaAfazeresResource {

    @Inject
    ListaAfazeresService listaAfazeresService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response createListaAfazeres(ListaAfazeres listaAfazeres) {
        listaAfazeresService.createItemAfazeres(listaAfazeres);
        return Response.ok().build();
    }
}
