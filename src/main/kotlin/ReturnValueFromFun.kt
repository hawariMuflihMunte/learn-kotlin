fun greeting(
    name: String = "guest",
    status: String = "neutral"
): String {
    return "Hello $name\nRight now I'm in $status mood"
}

fun main() {
    println(greeting("Hawari", "Happy"))
}
