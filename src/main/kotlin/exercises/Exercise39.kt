package exercises

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    fun isPopular(): Boolean {
        return playCount >= 1000
    }

    fun description(): String {
        return "$title, performed by $artist, was released in $yearPublished"
    }
}

fun main() {
    val imagineJohnLennon = Song(
        title = "Imagine",
        artist = "John Lennon",
        yearPublished = 1971,
        playCount = 1000000
    )

    println(imagineJohnLennon.description())
}
