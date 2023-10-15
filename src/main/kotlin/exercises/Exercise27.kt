package exercises

class ParseIntCharProblem {
    fun getAge(yearsOld: String): Int {
        return yearsOld.first().toString().toInt()
    }
}

fun main() {
    println(ParseIntCharProblem().getAge("4 years old"))
}
