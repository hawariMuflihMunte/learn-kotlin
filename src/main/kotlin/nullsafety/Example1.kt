package nullsafety

fun main() {
    var neverNull: String = "This can't be null"

    // Throws a compiler error
    // neverNull = null

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-nullable"

    // Throws a compiler error
    // nullable = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
    // println(strLength(nullable)) // Throws error
}
