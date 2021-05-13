package exposicion.ejemplo.servicios;

import exposicion.ejemplo.dao.ProductoDAO;
import exposicion.ejemplo.modelo.Producto;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *wh
 * @author Administrador
 */

//Ruta por la cual será accedido este recurso
@Path("Productos")
public class ProductoServicio {
    
    //invocamos nuestro objeto lista de productos
    private static List<Producto> lista = ProductoDAO.getProductos();
    
    //(2)
    @GET
    //(3)
    @Produces(MediaType.APPLICATION_JSON)
    
    //Todos los metodos de nuestros recursos van a devolver un objeto de tipo 
    //REPSONSE
    public Response getProductos(){
        
        //Devolvemos la respuesta al metodo devolviendole la lista
        return Response.ok(lista).build();
    }
}
