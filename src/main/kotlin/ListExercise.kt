fun main() {
    val greenNumbers: List<Int> = listOf(
        1,
        9,
        24
    )
    val redNumbers: List<Int> = listOf(
        7,
        8,
        12,
        19
    )

    println("Green numbers in total: ${greenNumbers.count()}")
    println("Red numbers in total: ${redNumbers.count()}")
}