/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import facades.BackendFacade;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import utils.EMF_Creator;

/**
 * REST Web Service
 *
 * @author ckfol
 */
@Path("backend")
public class BackendResource {

    @Context
    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();
    private UriInfo context;
    private BackendFacade instance = BackendFacade.getBackendFacade(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    

    /**
     * Creates a new instance of BackendResource
     */
    public BackendResource() {
    }

    /**
     * Retrieves representation of an instance of rest.BackendResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/employees")
    @Produces(MediaType.APPLICATION_JSON)
    public String getEventsByCalendar() {
        
        return GSON.toJson(instance.getEmployees());
    }

    /**
     * PUT method for updating or creating an instance of BackendResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
