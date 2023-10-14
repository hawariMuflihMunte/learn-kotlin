package exercises

fun twiceAsOld(
    dadYearsOld: Int,
    sonYearsOld: Int
): Int {
    return if ((dadYearsOld - sonYearsOld) < sonYearsOld) {
        sonYearsOld - (dadYearsOld - sonYearsOld)
    } else {
        (dadYearsOld - sonYearsOld) - sonYearsOld
    }
}

fun main() {
    println(twiceAsOld(55, 30))
}
