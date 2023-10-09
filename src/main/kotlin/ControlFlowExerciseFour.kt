fun main() {
    val words: List<String> = listOf(
        "dinosaur",
        "limousine",
        "magazine",
        "language"
    )

    for (word in words) {
        if (word.startsWith("l")) {
            println(word)
        }
    }
}