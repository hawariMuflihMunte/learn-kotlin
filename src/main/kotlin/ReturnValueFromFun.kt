fun greeting(
    name: String = "guest",
    status: String = "neutral"
): String {
    return "Hello $name\nRight now I'm in $status mood"
}

fun main() {
    println(greeting("Hawari", "Happy"))

    //  This is List
    //  Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf(
        "triangle (m)",
        "square (m)",
        "circle (m)"
    )
    println(shapes)

    /*
    * To prevent unwanted modifications, you can obtain read-only views
    * of mutable lists by assigning them to a `List`:
    * */
    val shapesLocked: List<String> = shapes
    println(shapesLocked)
    // This is also called casting

    println(readOnlyShapes[1])
    println("This readOnlyShapes has ${readOnlyShapes.count()} items")

    shapes.add("pentagon")
    println(shapes)
}
