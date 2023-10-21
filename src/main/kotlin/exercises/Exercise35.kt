package exercises

/*
* - As a first-class construct, functions are also data types
* */

fun main() {
    val trickFunction = trick
    trick()
    trickFunction()
}

val trick = {
    println("No treats!")
}
