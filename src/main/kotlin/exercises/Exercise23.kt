package exercises

object solution {
    fun areaOrPerimeter(
        l: Int,
        w: Int
    ): Int {
        return if (l == w) {
            l * w
        } else {
            (l * 2) + (w * 2)
        }
    }
}

fun main() {
    println(solution.areaOrPerimeter(3, 4))
}
