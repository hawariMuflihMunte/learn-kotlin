package exercises

fun opposite(number: Int): Int {
    return if (number < 0) {
        // Converts into positive
        -number
    } else {
        // Converts into negative
        -number
    }
}

fun main() {
    println(opposite(-10))
}
