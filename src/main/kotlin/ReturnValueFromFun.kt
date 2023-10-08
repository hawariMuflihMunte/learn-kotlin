fun greeting(
    name: String = "guest",
    status: String = "neutral"
): String {
    return "Hello $name\nRight now I'm in $status mood"
}

fun learnList() {
    println("\n=======LIST=======")

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

fun learnSet() {
    println("\n=======SET=======")

    // Read-only set
    val readOnlyFruit = setOf(
        "apple",
        "banana",
        "cherry"
    )
    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf(
        "apple",
        "banana",
        "cherry",
        "cherry"
    )

    /*
    * To prevent unwanted modifications, you can obtain read-only views
    * of mutable lists by assigning them to a `Set`:
    * */
    val fruitLocked: Set<String> = fruit
    println("This set has ${readOnlyFruit.count()} items")
    println("bananaIsExistInSet: ${"banana" in fruitLocked}")
}

fun learnMap() {
    println("\n=======MAP=======")

    // Read-only map
    val readOnlyJuiceMenu = mapOf(
        "apple" to 100,
        "kiwi" to 190,
        "orange" to 100
    )
    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf(
        "apple" to 100,
        "kiwi" to 190,
        "orange" to 100
    )

    println("This map has ${readOnlyJuiceMenu.count()} items")

    val juiceMenuLocked: Map<String, Int> = juiceMenu
    println("The value of apple juice is: ${juiceMenuLocked["apple"]}")
}

fun main() {
    println(greeting("Hawari", "Happy"))

    learnList()
    learnSet()
    learnMap()
}
