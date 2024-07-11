package org.example
//Funcion de Orden Superior

fun main() {
    println(aplicarOperacion(5, ::cuadrado)) // Imprime el numero 25
}
fun aplicarOperacion(numero: Int, operacion: (Int) -> Int): Int {
    return operacion(numero)
}

fun cuadrado(numero: Int): Int {
    return numero * numero
}


