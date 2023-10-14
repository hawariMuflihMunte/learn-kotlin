package exercises

fun simpleArraySum(ar: Array<Int>): Int {
    var result: Int = 0
    for (i in ar) {
        result += i
    }
    return result
}

fun main() {
    println(simpleArraySum(arrayOf(8, 90, 127, 255)))
}
