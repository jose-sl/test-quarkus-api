/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.gt.resource;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import java.util.Optional;
/**
 *
 * @author Jose
 */
@Path("/HolaMundo")
public class TestResource {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String holaMundo(){
        return "Hola Mundo";
    }
    
    @GET
    @Path("/saludar")
    @Produces(MediaType.TEXT_PLAIN)
    public String saludar(@QueryParam("mensaje") String mensaje){
        return Optional.ofNullable(mensaje).orElse("No se que decir");
    }
    
    @DELETE
    @Path("/eliminar-saludo")
    @Produces(MediaType.TEXT_PLAIN)
    public String eliminar(@QueryParam("mensaje") String mensaje){
        return "Mensaje eliminado: " + mensaje;
    }
}
