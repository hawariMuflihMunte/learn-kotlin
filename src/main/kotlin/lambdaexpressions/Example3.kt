package lambdaexpressions

fun main() {
    val nums: List<Int> = listOf(
        1,
        -2,
        3,
        -4,
        5,
        -6
    )
    val positives = nums.filter { x -> x > 0 }
    val negatives = nums.filter { x -> x < 0 }
    println(positives)
    println(negatives)
}
