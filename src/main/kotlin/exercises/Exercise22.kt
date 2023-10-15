package exercises

fun abbrevName(name: String): String {
    val newString: List<String> = name.split(" ")

    val initialFirst: String = newString[0]
        .first()
        .toString()
        .uppercase()
    val initialSecond: String = newString[newString.count() - 1]
        .first()
        .toString()
        .uppercase()

    return "$initialFirst.$initialSecond"
}

fun main() {
    println(abbrevName("Sam Harris"))
}
