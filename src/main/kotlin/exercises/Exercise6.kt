package exercises

val PI: Float = 3.14F

fun circleArea(radius: Int): Float {
    return PI * (radius * radius)
}

fun main() {
    println(circleArea(4))
}
