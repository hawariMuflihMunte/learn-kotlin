package exercises

fun removeChar(str: String): String {
    var strList: MutableList<String> = mutableListOf()

    for (s in str) {
        strList.add(s.toString())
    }

    strList.removeAt(0)
    strList.removeAt(strList.count() - 1)

    return strList.joinToString("")
}

fun main() {
    println(removeChar("eloquent"))
}
