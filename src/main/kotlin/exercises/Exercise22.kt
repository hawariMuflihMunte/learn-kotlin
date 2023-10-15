package exercises

fun abbrevName(name: String): String {
    val regEx: Regex = Regex("""(\w)\s+(\w)""")
    val match = regEx.find(name) ?: return ""

    val initialFirst = match.groupValues[1].toString().uppercase()
    val initialSecond = match.groupValues[2].toString().uppercase()

    return "$initialFirst.$initialSecond"
}

fun main() {
    println(abbrevName("Sam Harris"))
}
