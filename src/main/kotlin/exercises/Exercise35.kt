package exercises

/*
* - As a first-class construct, functions are also data types
* */

fun main() {
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

//    val cupcake: (Int) -> String = { quantity ->
//        "Have a cupcake"
//    }

    val treatFunction = trickOrTreat(false, coins)
    val trickFunction = trickOrTreat(true, null)
    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    return if (isTrick) {
        trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        treat
    }
}

val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}
