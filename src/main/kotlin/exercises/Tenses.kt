package exercises

object Tenses {
    fun simplePresent(
        subjectContext: String,
        verb: String,
        objectContext: String,
        complimentOrAdjective: String?
    ): String {
        if (
            subjectContext.lowercase() == "he" ||
            subjectContext.lowercase() == "she" ||
            subjectContext.lowercase() == "it"
        ) {
            if (verb.last().lowercase() == "y") {
                val filterVerb: String = verb.dropLast(1)
                return "${subjectContext.capitalize()} ${filterVerb}ies $objectContext ${complimentOrAdjective ?: ""}"
            }

            return "${subjectContext.capitalize()} ${verb}s $objectContext ${complimentOrAdjective ?: ""}"
        }

        return "${subjectContext.capitalize()} $verb $objectContext ${complimentOrAdjective ?: ""}"
    }
}

fun main() {
    println(
        Tenses.simplePresent(
            subjectContext = "he",
            verb = "deny",
            objectContext = "book",
            complimentOrAdjective = "in the park"
        )
    )
}