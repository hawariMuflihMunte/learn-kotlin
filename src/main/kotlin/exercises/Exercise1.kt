package exercises

fun evenOrOdd(number: Int): String {
    if (number % 2 == 0) {
        return "Even"
    }
    return "Odd"
}

fun main() {
    println(evenOrOdd(5))
}
