package org.example
//Modelar un Producto
fun main() {
    val laptop = Producto("Laptop X", 1500.0)
    laptop.mostrarPrecioConIVA() // Imprime "Precio con IVA: 1740.0"
}
class Producto(
    val nombre: String,
    val precio: Double
) {
    // Método para mostrar el precio con IVA
    fun mostrarPrecioConIVA() {
        val precioConIVA = precio * 1.16  // Calcula el precio con IVA del 16%
        println("Precio con IVA: $precioConIVA")
    }
}
