package nullsafety

fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() {
    var nullStr: String? = null
    println(lengthString(nullStr))
}
