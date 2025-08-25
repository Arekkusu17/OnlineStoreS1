/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinestores1;

/**
 * Gestor de descuentos implementado como Singleton.
 * Garantiza una única instancia para la gestión centralizada de descuentos.
 * @author Alex Fernández
 */
// Clase Singleton: DiscountManager
public class DiscountManager {
    
    // 1. Variable estática privada final que contendrá la única instancia
    private static final DiscountManager instance = new DiscountManager();
    
    /**
     * Constructor privado para evitar instanciación externa.
     * Solo se ejecuta una vez durante la carga de la clase.
     */
    private DiscountManager() {
        System.out.println("[SINGLETON] Gestor de descuentos creado.");
    }
    
    /**
     * Retorna la única instancia del DiscountManager.
     * Thread-safe y eficiente mediante inicialización temprana.
     */
    public static DiscountManager getInstance() {
        return instance;
    }

    /**
     * Aplica un porcentaje de descuento al precio base.
     * Calcula y retorna el precio final después del descuento.
     */
    public double applyDiscount(double price, double discountPercent) {
        double discount = price * (discountPercent / 100);
        return price - discount;
    }
}
