fun main() {
    val number2word: Map<Int, String> = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )
    val num: Int = 2

    println("$num is spelt as '${number2word[num]}'")
}