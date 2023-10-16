package exercises

public class MixedSum {
    /**
     * Assume input will be only of Int or String type
     */
    public fun sum(mixed: List<Any>): Int {
        var result: Int = 0

        for (num in mixed) {
            if (num is String && !(num.toInt() >= 0 || num.toInt() <= 9)) {
                continue
            }

            if (num is String) {
                result += num.toInt()
            }

            if (num is Int) {
                result += num
            }
        }

        return result
    }
}

fun main() {
    println(MixedSum().sum(listOf("2", "6", "2")))
}
