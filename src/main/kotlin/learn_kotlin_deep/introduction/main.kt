package learn_kotlin_deep.introduction

fun main() {
    Variables().example()
    println("\n=== ## ====\n")
    NullSafety().example()
    NullSafety().workingWithNulls()
    println("\n=== ## ====\n")
    val contact = Classes.Contact(1, "mary@gmail.com")
    println(contact.id)
    contact.email = "jane@gmail.com"
    println(contact.email)
    println("\n=== ## ====\n")
}