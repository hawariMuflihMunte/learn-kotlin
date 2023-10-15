package exercises

import kotlin.math.floor

fun litres(time: Double): Int {
    return floor(time / 2).toInt()
}

fun main() {
    println(litres(12.3))
}
