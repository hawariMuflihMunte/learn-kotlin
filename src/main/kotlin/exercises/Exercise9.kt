package exercises

// Opposites Attract
fun loveFun(
    flowerA: Int,
    flowerB: Int
): Boolean {
    return (flowerA % 2 == 0 && flowerB % 2 != 0) || (flowerA % 2 != 0 && flowerB % 2 == 0)
}

fun main() {
    println(loveFun(2, 2))
}
