/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API.services;

import API.ApplicationConfig;
import static API.ApplicationConfig.listaDeCarros;
import API.Entity.Carro;
import com.google.gson.Gson;
import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("carro")
public class CarroService {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response cadastrarCarro(JsonObject body) {

        String modelo = body.getString("modelo");
        String renavan = body.getString("renavan");
        String cor = body.getString("cor");
        int ano = body.getInt("ano");
        double preco = body.getJsonNumber("preco").doubleValue();
        String photo = body.getString("photo");
        boolean vendido = body.getBoolean("vendido");

        Carro c = new Carro(modelo, renavan, cor, ano, preco, photo, vendido);
        ApplicationConfig.listaDeCarros.add(c);

        return Response.status(201).entity(new Gson().toJson(c)).build();

    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public Response buscarTodosCarros() {
        return Response.status(200).entity(new Gson().toJson(listaDeCarros)).build();

    }

}
