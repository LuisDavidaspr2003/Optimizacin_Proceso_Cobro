package cliente;

import java.util.List;

/**
 * Clase que representa un cliente con una lista de productos.
 * 
 * El propósito de esta clase es almacenar información sobre un cliente y
 * los productos asociados a él.
 
 * @author Usuario
 */
public class ClienteProducto {

    /*
     * Campo para almacenar el nombre del cliente.
     */
    private final String nombre;

    /*
     * Campo para almacenar la lista de productos asociados al cliente.
     */
    private final List<Producto> productos;

    /**
     * Constructor de la clase ClienteProducto.
     * 
     * @param nombre    El nombre del cliente.
     * @param productos Lista de productos asociados al cliente.
     */
    public ClienteProducto(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    /**
     * Método para obtener el nombre del cliente.
     
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener la lista de productos asociados al cliente.
     * 
     * @return Lista de productos asociados al cliente.
     */
    public List<Producto> getProductos() {
        return productos;
    }

}
