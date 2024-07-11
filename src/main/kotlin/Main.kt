package org.example
//Numeros Pares

fun main() {
    val numeros = arrayOf(1,2,3,4,5,6)
    println(sumarPares(numeros))
}
fun sumarPares(numeros: Array<Int>): Int {
    var suma = 2+4+6

    for (numero in numeros) {
        if (numero % 2 == 0) {
            println("$numero")
        }
    }

    return suma
}


