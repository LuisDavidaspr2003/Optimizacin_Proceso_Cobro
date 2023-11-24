 
package cliente;
/**
 * Clase que representa un producto con atributos como nombre, cantidad y precio.
 */
public class Producto {

    // Campo para almacenar el nombre del producto
    private final String nombre;

    // Campo para almacenar el precio del producto
    private final float precio;

    // Campo para almacenar la cantidad del producto
    private final int cantidad;

    /**
     * Constructor de los atributos como nombre, cantidad y precio.
     *
     * @param nombre   Nombre del producto.
     * @param precio   Precio del producto.
     * @param cantidad Cantidad del producto.
     */
    public Producto(String nombre, float precio, int cantidad) {
        // Inicializar los campos con los valores proporcionados en el constructor
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     * Método que devuelve el nombre del producto.
     *
     * @return Nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que devuelve el precio del producto.
     
     * @return Precio del producto.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Método que devuelve la cantidad del producto.
     * @return Cantidad del producto.
     */
    public int getCantidad() {
        return cantidad;
    }
}
