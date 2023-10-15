package exercises

fun highAndLow(numbers: String): String {
    val splitStringToList: List<String> = numbers.split(" ")

    var high: Int = splitStringToList[0].toInt()
    var low: Int = splitStringToList[0].toInt()

    for (s in splitStringToList) {
        if (s.toInt() < low) {
            low = s.toInt()
        }

        if (s.toInt() > high) {
            high = s.toInt()
        }
    }

    return "$high $low"
}

fun main() {
    println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
}
