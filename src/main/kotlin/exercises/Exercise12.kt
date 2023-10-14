package exercises

fun twiceAsOld(
    dadYearsOld: Int,
    sonYearsOld: Int
): Int {
    val ageGap = dadYearsOld - sonYearsOld

    return if (ageGap < sonYearsOld) {
        sonYearsOld - ageGap
    } else {
        ageGap - sonYearsOld
    }
}

fun main() {
    println(twiceAsOld(55, 30))
}
