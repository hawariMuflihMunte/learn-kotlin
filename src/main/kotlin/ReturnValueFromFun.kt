fun greeting(name: String, status: String): String {
    return "Hello $name\nRight now I'm in $status mood"
}

fun main() {
    println(greeting("Hawari", "Happy"))
}
