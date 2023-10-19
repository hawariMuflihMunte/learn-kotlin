package exercises

object Kata {
    fun digitize(n: Long): IntArray {
        val nToString: String = n.toString()
        val result: MutableList<String> = mutableListOf()

        for (str in nToString) {
            result.add(str.toString())
        }

        val convertResultToInt: MutableList<Int> = mutableListOf<Int>()
        for (strToBeConverted in result.joinToString("").reversed()) {
            convertResultToInt.add(strToBeConverted.toString().toInt())
        }

        return convertResultToInt.toIntArray()
    }
}

fun main() {
    println(Kata.digitize(35231))
}
