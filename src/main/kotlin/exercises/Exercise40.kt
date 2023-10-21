package exercises

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        if (referrer != null) {
            println("Name: $name\nAge: $age\nLikes to ${hobby ?: "doing nothing"}. Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.\n")
        } else {
            println("Name: $name\nAge: $age\nLikes to ${hobby ?: "doing nothing"}. Doesn't have a referrer.\n")
        }
    }
}
