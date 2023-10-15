package exercises

// Remove spaces from string
fun noSpace(x: String): String {
    var result: MutableList<String> = mutableListOf()

    for (s in x) {
        if (s != ' ') {
            result.add(s.toString())
        }
    }

    return result.joinToString("")
}

fun main() {
    println(noSpace("A jskdjakdk        dsdsa d   a  ds dd d"))
}
