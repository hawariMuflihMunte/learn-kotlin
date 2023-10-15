package exercises

object Grasshopper {
    fun summation(n: Int): Int {
        if (n <= 0) {
            return 1
        }

        var result: Int = 0
        for (i in 1..n) {
            result += i
        }

        return result
    }
}

fun main() {
    println(Grasshopper.summation(2))
}
