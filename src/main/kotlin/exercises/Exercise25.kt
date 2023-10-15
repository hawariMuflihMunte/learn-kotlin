package exercises

fun findShort(s: String): Int {
    val tempStrList: List<String> = s.split(" ")
    var shortestCount: Int = s.length

    for (str in tempStrList) {
        if (str.length < shortestCount) {
            shortestCount = str.length
        }
    }

    return shortestCount
}

fun main() {
    println(findShort("bitcoin take over the world maybe who knows perhaps"))
}
