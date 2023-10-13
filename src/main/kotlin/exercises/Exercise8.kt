package exercises

fun quadraticFormula(a: Double, b: Double, c: Double): List<Double> {
    val discriminant = b * b - 4 * a * c

    if (discriminant < 0) {
        // The quadratic equation has complex solutions
        return emptyList()
    }

    val root1 = (-b + Math.sqrt(discriminant) / (2 * a))
    val root2 = (-b - Math.sqrt(discriminant) / (2 * a))

    return listOf(root1, root2)
}

fun main() {
    val a: Double = 1.0
    val b: Double = 2.0
    val c: Double = 3.0

    val roots = quadraticFormula(a, b, c)

    println(roots)

}
