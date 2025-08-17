# Online Store - Singleton Pattern Example

This project is a simple Java application that simulates an **online clothing store order system**.  
It demonstrates the use of the **Singleton design pattern** through the `DiscountManager` class, which ensures only one instance is responsible for applying discounts.

## 🚀 Features
- Implements the **Singleton pattern** in Java.
- `DiscountManager` applies discounts to products.
- Demonstrates usage with multiple products and different discount rates.
- Ensures only **one instance** of `DiscountManager` exists across the application.

## 📂 Project Structure
```text
src/
├── DiscountManager.java   # Singleton class
└── Main.java              # Entry point with examples
```



## 📌 Example Output
When running `Main`, you’ll see something like:

```text
Gestor de descuentos creado.
Camisa: Precio original $50000.0 | Precio con descuento (15%): $42500.0
Pantalón: Precio original $80000.0 | Precio con descuento (20%): $64000.0
Zapatos: Precio original $120000.0 | Precio con descuento (10%): $108000.0
¿Manager y otroManager son la misma instancia? true
```

## 👤 Author
- Alex Fernández
