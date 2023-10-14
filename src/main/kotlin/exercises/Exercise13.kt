package exercises

fun squareSum(n: Array<Int>): Int {
    var result: Int = 0

    for (i in n) {
        result += i * i
    }

    return result
}

fun main() {
    println(squareSum(arrayOf(0, 3, 4, 5)))
}
