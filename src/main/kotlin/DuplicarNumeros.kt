package org.example
//Duplicar Numeros

fun main() {
    val numero = 5
    println(numero.duplicar()) // Debería imprimir 10
}
fun Int.duplicar(): Int {
    return this * 2
}

