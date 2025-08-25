/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.onlinestores1;

/**
 * Demostración del patrón Singleton con DiscountManager.
 * Muestra la aplicación de descuentos y verifica la unicidad de la instancia.
 * @author Alex Fernández
 */
public class OnlineStoreS1 {
    
    /**
     * Método principal que demuestra el funcionamiento del Singleton.
     * Aplica descuentos a diferentes productos y verifica la unicidad de instancia.
     */
    public static void main(String[] args) {
        mostrarEncabezado();
        
        // Obtener la instancia única del DiscountManager
        DiscountManager discountManager = DiscountManager.getInstance();
        
        // Demostrar aplicación de descuentos en productos variados
        aplicarDescuentosProductos(discountManager);
    }
    
    /**
     * Muestra el encabezado de la demostración.
     * Presenta el propósito del programa de forma clara.
     */
    private static void mostrarEncabezado() {
        System.out.println("=============================================================");
        System.out.println("                   Tienda Online - Grupo 17                 ");
        System.out.println("=============================================================");
        System.out.println();
    }
    
    /**
     * Aplica descuentos a una variedad de productos.
     * Demuestra el funcionamiento del método applyDiscount con diferentes casos.
     */
    private static void aplicarDescuentosProductos(DiscountManager manager) {
        System.out.println("--- APLICACION DE DESCUENTOS A PRODUCTOS ---");
        System.out.println();
        
        // Productos con diferentes rangos de precio y descuentos
        aplicarDescuento(manager, "Camisa", 50000, 15);
        aplicarDescuento(manager, "Pantalón", 80000, 20);
        aplicarDescuento(manager, "Zapatos", 120000, 10);
        aplicarDescuento(manager, "Chaqueta", 150000, 25);
        aplicarDescuento(manager, "Reloj", 300000, 30);
        aplicarDescuento(manager, "Bolso", 75000, 5);
        
        System.out.println("---------------------------------------------");
        System.out.println();
    }
    
    /**
     * Aplica descuento a un producto específico y muestra el resultado.
     * Formatea la salida de manera clara y profesional.
     */
    private static void aplicarDescuento(DiscountManager manager, String producto, 
                                       double precio, double descuento) {
        double precioFinal = manager.applyDiscount(precio, descuento);
        double ahorrado = precio - precioFinal;
        
        System.out.printf("%-10s | $%,8.0f -> $%,8.0f (%2.0f%% desc.) | Ahorro: $%,6.0f%n", 
                         producto, precio, precioFinal, descuento, ahorrado);
    }
}
