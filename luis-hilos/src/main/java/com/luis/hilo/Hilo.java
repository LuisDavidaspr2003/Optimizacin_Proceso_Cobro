package com.luis.hilo;

import cliente.ClienteProducto;
import cliente.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase de prueba que simula la compra de dos clientes por dos cajeras usando hilos.
 * 
 * @author Usuario
 */
public class Hilo { 

    /**
     * Método principal que inicia la simulación de compra con hilos.
     *
     * @param args
     */
    public static void main(String[] args) {
        // Crear una lista de productos y establecerla 
        List<Producto> productosCliente1 = new ArrayList<>();
        List<Producto> productosCliente2 = new ArrayList<>();
        
        setProductos1(productosCliente1);
        
        setProductos2(productosCliente2);

        // Crear dos clientes con la misma lista de productos
        ClienteProducto cliente1 = new ClienteProducto("CARLOS FERNANDO", productosCliente1);
        ClienteProducto cliente2 = new ClienteProducto("JUAN DAVID RODRIGUEZ", productosCliente2);

        // Obtener la marca de tiempo inicial
        long initialTime = System.currentTimeMillis();

        // Crear dos instancias de la clase CajeraProducto que implementa Runnable
        CajeraProducto cajera1 = new CajeraProducto("CAJERA UNO ", cliente1, initialTime);
        CajeraProducto cajera2 = new CajeraProducto("CAJERA DOS ", cliente2, initialTime);

        // Crear dos hilos y asignar las cajeras a cada hilo
        Thread thread1 = new Thread(cajera1);
        Thread thread2 = new Thread(cajera2);

        // Iniciar ambos hilos
        thread1.start();
        thread2.start();
        
              try {
            thread1.join();
            thread2.join();
            
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            System.out.println("Error " );
        }
    }
    
    

    /**
     * Método que agrega productos a la lista de productos cliente uno.
     *
     * @param productos Lista de productos a la que se agregarán los productos.
     */
    private static void setProductos1(List<Producto> productos) {
        Producto producto1 = new Producto("Naranjas", 500, 12);
        Producto producto2 = new Producto("Uvas", 15000, 2);
        Producto producto3 = new Producto("Manzanas", 2000, 10);
        Producto producto4 = new Producto("Manzanas", 2000, 10);
        

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
 

    }
     /**
     * Método que agrega productos a la lista de productos cliente dos.
     *
     * @param productos Lista de productos a la que se agregarán los productos.
     */
     private static void setProductos2(List<Producto> productos) {
        Producto producto1 = new Producto("Carne", 500, 12);
        Producto producto2 = new Producto("Arroz", 15000, 2);
        Producto producto3 = new Producto("Pollo", 2000, 10);
        Producto producto4 = new Producto("lentejas", 2000, 10);
        
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        
   
        


    }
}
