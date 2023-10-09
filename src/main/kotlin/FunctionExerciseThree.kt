fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0): Int {
    return ((hours * 60) + minutes) * 60 + seconds
}

fun main() {
    println(intervalInSeconds(hours = 24))
}
