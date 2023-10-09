package lambdaexpressions

fun repeatN(n: Int, action: () -> Unit): Unit {
    for (i in 1..n) {
        action()
    }
}

fun main() {
    repeatN(5) {
        println("Hello")
    }
}
