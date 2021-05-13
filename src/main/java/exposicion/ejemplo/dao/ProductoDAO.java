package exposicion.ejemplo.dao;

import exposicion.ejemplo.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */

// Clase que expone todos los productos de la base de datos, vamos a crea modelo

public class ProductoDAO {
    
    //Creamos metodo que devuelva una lista de productos
    //Se crea una lista para motivo de ejemplo que devuelva cierta cantidad de productos
    public static List<Producto> getProductos(){
        List<Producto> lista = new ArrayList();
        
        //Creación de productos
        Producto producto = new Producto(1,"Azucar",2);
        Producto producto2 = new Producto(2,"Canela",4);
        Producto producto3 = new Producto(3,"Sal",6);
        
        //Agregamos los productos a la lista
        lista.add(producto);
        lista.add(producto2);
        lista.add(producto3);
        
        //(1)
        return lista;
    }
}