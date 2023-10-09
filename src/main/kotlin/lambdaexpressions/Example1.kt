package lambdaexpressions

fun main() {
    println({ str: String -> str.uppercase() }("hello"))
}
