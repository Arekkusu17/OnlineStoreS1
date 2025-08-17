/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinestores1;

/**
 *
 * @author Alex Fernández
 */
// Clase Singleton: DiscountManager
public class DiscountManager {
    
    // 1. Variable estática privada que contendrá la única instancia
    private static DiscountManager instance;
    
    // 2. Constructor privado (evita instanciación externa)
    private DiscountManager() {
        System.out.println("[SINGLETON] Gestor de descuentos creado.");
    }
    
    // 3. Método estático público para obtener la instancia única
    public static DiscountManager getInstance() {
        if (instance == null) {
            instance = new DiscountManager();
        }
        return instance;
    }

    // Método ejemplo: aplicar descuento
    public double applyDiscount(double price, double discountPercent) {
        double discount = price * (discountPercent / 100);
        return price - discount;
    }
}
