package exercises

fun dutyFree(
    normPrice: Int,
    discount: Int,
    hol: Int
): Int {
    return hol * 100 / discount / normPrice
}

fun main() {
    println(dutyFree(12, 50, 1000))
}
