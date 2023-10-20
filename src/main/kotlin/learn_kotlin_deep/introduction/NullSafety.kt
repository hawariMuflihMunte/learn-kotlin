package learn_kotlin_deep.introduction

class NullSafety {
    fun example() {
//        var neverNull: String = "This can't be null"
//        neverNull = null // error
        var nullable: String? = "You can keep a null here"
        nullable = null

        println(nullable)
    }

    fun workingWithNulls() {
        fun describeString(maybeString: String?): String {
            return if (maybeString != null && maybeString.length > 0) {
                "String of length ${maybeString.length}"
            } else {
                "Empty or null string"
            }
        }

        println(describeString(null))
    }
}