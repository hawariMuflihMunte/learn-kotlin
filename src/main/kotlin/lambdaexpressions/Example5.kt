package lambdaexpressions

// Invoke separately
fun main() {
    println({ str: String -> str.uppercase() }("Hello"))
}
