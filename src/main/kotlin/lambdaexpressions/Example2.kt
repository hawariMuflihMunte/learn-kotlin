package lambdaexpressions

fun main() {
    val uppercaseString = { str: String -> str.uppercase() }
    println(uppercaseString("hello"))
}
