package br.com.jaelson.jaxrs.http;

import br.com.jaelson.jaxrs.entity.ListaItem;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaels on 03/11/2016.
 */
@Path("lista")
public class ListaItemResource {

    @GET
    @Produces({"application/json","application/xml"})
    public List<ListaItem> getAll(){
        List<ListaItem> listaItems = new ArrayList<>();
        listaItems.add(new ListaItem(1,"Café",5));
        listaItems.add(new ListaItem(2,"Pizza",59));
        listaItems.add(new ListaItem(3,"Coca",519));
        return listaItems;
    }
    /*

    FIND ID GET /ID
    SAVE POST
    UPDATE PUT /ID
    DELETE ID /ID


     */

    @GET
    @Path("{id}")
    public  ListaItem find(@PathParam("id") int id){
        ListaItem item = new ListaItem(id,"trakinas",30);
        return  item;
    }

    @POST
    @Consumes("application/json")
    public Response save(ListaItem item, @Context UriInfo uriInfo){
        item.setId(1);
        System.out.print(item);
        URI uri = uriInfo.getAbsolutePathBuilder().path("/"+item.getId()).build();
        return Response.created(uri).entity(item).build();
    }

    @PUT
    @Path("{id}")
    public ListaItem update(@PathParam("id") int id, ListaItem item){
        System.out.print(item);
        return  item;
    }

    @DELETE
    @Path("{id}")
    public  Response delete(@PathParam("id") int id){
      //  ListaItem item = new ListaItem(id,"trakinas",30);

        //codigo aqui de remoção

        return  Response.ok().build();
    }
}
