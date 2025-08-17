/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.onlinestores1;

/**
 *
 * @author Alex Fernández
 */
public class OnlineStoreS1 {
    public static void main(String[] args) {
        // 1. Obtenemos la instancia única del DiscountManager
        DiscountManager discountManager = DiscountManager.getInstance();

        // Ejemplo A: Producto 1 - Camisa
        double shirtPrice = 50000;
        double discountedShirtPrice = discountManager.applyDiscount(shirtPrice, 15);
        System.out.println("Camisa: Precio original $" + shirtPrice 
                         + " | Precio con descuento (15%): $" + discountedShirtPrice);

        // Ejemplo B: Producto 2 - Pantalón
        double pantsPrice = 80000;
        double discountedPantsPrice = discountManager.applyDiscount(pantsPrice, 20);
        System.out.println("Pantalón: Precio original $" + pantsPrice 
                         + " | Precio con descuento (20%): $" + discountedPantsPrice);

        // Ejemplo C: Producto 3 - Zapatos
        double shoesPrice = 120000;
        double discountedShoesPrice = discountManager.applyDiscount(shoesPrice, 10);
        System.out.println("Zapatos: Precio original $" + shoesPrice 
                         + " | Precio con descuento (10%): $" + discountedShoesPrice);

        // Ejemplo D: Usando la instancia desde otra variable. Esto muestra la instancia es la misma que la anterior, a pesar de apuntar a otra variable.
        DiscountManager discountManagerB = DiscountManager.getInstance();
        System.out.println("¿discountManager y discountManagerB son la misma instancia? " 
                         + (discountManager == discountManagerB));
        
    }    
}
