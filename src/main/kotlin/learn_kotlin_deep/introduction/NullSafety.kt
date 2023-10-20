package learn_kotlin_deep.introduction

class NullSafety {
    fun example() {
//        var neverNull: String = "This can't be null"
//        neverNull = null // error
        var nullable: String? = "You can keep a null here"
        nullable = null
    }
}