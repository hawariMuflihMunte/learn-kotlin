package exercises

fun replaceVowelToExclamationMark(s: String): String {
    val vowels: Regex = Regex("[aiueoAIUEO]")
    return vowels.replace(s, "!")
}

fun main() {
    println(replaceVowelToExclamationMark("Hi Hawari Muflih Munte"))
}
