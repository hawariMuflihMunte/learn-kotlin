package exercises

class PalindromeChecker {
    fun isPalindrome(s: String): Boolean {
        val regex: Regex = Regex("[\\w]+")
        val regexToRemoveSpecialChars: Regex = Regex("[^a-zA-Z0-9]")
        val stringValue: List<String> = regex
            .findAll(s)
            .map {
                it.value.replace(regexToRemoveSpecialChars, "")
            }
            .toList()
        val a: String = stringValue.joinToString("").lowercase()
        val b: String = stringValue.joinToString("").reversed().lowercase()

        return a == b
    }
}

fun main() {
    println(PalindromeChecker().isPalindrome("A man, a plan, a canal: Panama"))
}
