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

    fun presentContinuous(
        subjectContext: String,
        verb: String,
        objectContext: String?,
        complimentOrAdjective: String?
    ): String? {
        if (subjectContext.lowercase() == "i") {
            return "${subjectContext.capitalize()} am ${verb}ing ${objectContext ?: ""} ${complimentOrAdjective ?: ""}"
        }

        if (
            subjectContext.lowercase() == "he" ||
            subjectContext.lowercase() == "she" ||
            subjectContext.lowercase() == "it"
        ) {
            return "${subjectContext.capitalize()} is ${verb}ing ${objectContext ?: ""} ${complimentOrAdjective ?: ""}"
        }

        if (
            subjectContext.lowercase() == "you" ||
            subjectContext.lowercase() == "they" ||
            subjectContext.lowercase() == "we"
        ) {
            return "${subjectContext.capitalize()} are ${verb}ing ${objectContext ?: ""} ${complimentOrAdjective ?: ""}"
        }

        return null
    }

    fun presentPerfect(
        subjectContext: String,
        verb: String,
        objectContext: String?,
        complimentOrAdjective: String?
    ): String {
        if (
            subjectContext.lowercase() == "he" ||
            subjectContext.lowercase() == "she" ||
            subjectContext.lowercase() == "it"
        ) {
            return "${subjectContext.capitalize()} has $verb ${objectContext ?: ""} ${complimentOrAdjective ?: ""}"
        }

        return "${subjectContext.capitalize()} have $verb ${objectContext ?: ""} ${complimentOrAdjective ?: ""}"
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

    println("")

    println(
        Tenses.presentContinuous(
            subjectContext = "I",
            verb = "eat",
            objectContext = "an apple",
            complimentOrAdjective = "in my room"
        )
    )

    println("")

    println(
        Tenses.presentPerfect(
            subjectContext = "I",
            verb = "cut",
            objectContext = "2 papers",
            complimentOrAdjective = null
        )
    )
}