package com.luis.hilo;

import cliente.ClienteProducto;
import cliente.Producto;

/**
 * Clase que representa una cajera que implementa Runnable para ser ejecutada en un hilo.
 * 
 * @author Usuario
 */
public class CajeraProducto implements Runnable {
    
    private String nombre;
    private ClienteProducto cliente;
    private long timeStamp;

    /**
     * Constructor de la clase CajeraProducto.
     
     * @param nombre Nombre de la cajera.
     * @param cliente Cliente cuya compra se va a procesar.
     * @param timeStamp Marca de tiempo para calcular el tiempo de procesamiento.
     */
    public CajeraProducto(String nombre, ClienteProducto cliente, long timeStamp) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.timeStamp = timeStamp;
    }
    
    /**
     * Implementación del método run() de la interfaz Runnable.
     * Procesa la compra del cliente.
     */
    @Override
    public void run() {
        System.out.println("La cajera " + this.nombre 
                + " comienza a procesar la compra del cliente " 
                + cliente.getNombre() + " en el tiempo: " 
                + (System.currentTimeMillis() - timeStamp)/ 1000 
                + " segundos ");
        
        int contCliente = 1;
        for (Producto producto : cliente.getProductos()) {
            this.esperarXsegundos();
            System.out.println("Procesando el producto " + contCliente 
                    + " nombre producto " + producto.getNombre() 
                    + " precio producto " + producto.getPrecio() 
                    + " cantidad de productos " + producto.getCantidad() 
                    + " costo total del producto " + producto.getCantidad() * producto.getPrecio() 
                    + " -> Tiempo: " + (System.currentTimeMillis() - timeStamp)/ 1000 
                    + " segundos");
            contCliente++;
        }
    }

    /**
     * Método privado que simula la espera de un segundo.
 
     */
    private void esperarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
