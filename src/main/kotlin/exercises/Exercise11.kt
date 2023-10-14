package exercises

fun grow(arr: IntArray): Int {
    var result: Int = 1
    for (i in arr) {
        result *= i
    }

    return result
}

fun main() {
    println(grow(intArrayOf(1, 2, 3)))
}
