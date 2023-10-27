package exercises

fun main() {
    var x = 0

    print("Enter x: ")
    val userInput = readlnOrNull()

    if (userInput != null) {
        x = userInput.toInt()
    }

    if (x > 10) {
        println("x is greater than 10")
    } else {
        println("x is lower or equal to 10")
    }
}