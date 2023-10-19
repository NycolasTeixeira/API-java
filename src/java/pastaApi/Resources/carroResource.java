
package pastaApi.Resources;

import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pastaApi.entities.Carro;


// caminho parar buscar os metodos
@Path("carro")
public class carroResource {

@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public Response cadastro(String body){
    
    System.out.println(body);
    
    return Response.status(Response.Status.CREATED).build();
    
}

@GET
@Produces(MediaType.APPLICATION_JSON)
public String buscarTodosCarros(){
    return "todos os carros";
}
    
}
