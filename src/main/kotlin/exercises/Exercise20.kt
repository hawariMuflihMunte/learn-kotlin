package exercises

fun getMiddle(word: String): String {
    if (word.length > 2) {
        val middleIndex: Int = word.length / 2

        return if (word.length % 2 == 0) {
            "${word[middleIndex - 1]}${word[middleIndex]}"
        } else {
            "${word[middleIndex]}"
        }
    }

    return word
}

fun main() {
    println(getMiddle("AB"))
}
