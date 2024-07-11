package org.example

abstract class FiguraGeometrica {
    abstract fun calcularArea(): Double
}
class Rectangulo(private val base: Double,private val altura:Double) : FiguraGeometrica() {
    override fun calcularArea(): Double {
        return base * altura
    }
}
//    fun main(args: Array<String>) {
//
//        val rectangulo = Rectangulo(12.0, 6.0)
//        println("Area del rectangulo: " + rectangulo.calcularArea())
//    }
class Circulo (private val radio: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double {
        return 3.1416 * radio
    }
}

fun main (args: Array<String>) {

    val circulo = Circulo(10.0)
    println("Area del Circulo: " + circulo.calcularArea())
}




