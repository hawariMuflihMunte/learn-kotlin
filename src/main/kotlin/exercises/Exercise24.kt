package exercises

fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> {
    if (input.isNullOrEmpty()) {
        return emptyArray()
    }

    var positivesCount: Int = 0
    var negativesSum: Int = 0

    for (num in input) {
        // Skips the value if it is 0
        if (num == 0) {
            continue
        }

        // Sums the negative values only
        if (num < 0) {
            negativesSum += num
        }

        // Count the positive values
        if (num > 0) {
            positivesCount++
        }
    }

    return arrayOf(positivesCount, negativesSum)
}

fun main() {
    println(countPositivesSumNegatives(arrayOf(0, 2, 3, 0, 5, 6, 7, 8, 9, 11, -11, -12, -13, -14)).joinToString(", "))
}
