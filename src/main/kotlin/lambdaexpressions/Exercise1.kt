package lambdaexpressions

fun main() {
    val actions: List<String> = listOf(
        "title",
        "year",
        "author"
    )
    val prefix: String = "https://example.com/book-info"
    val id: Int = 5
    val urls: List<String> = actions.map { action -> "$prefix/$id/$action" }
    println(urls)
}
