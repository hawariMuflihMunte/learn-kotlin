fun main() {
    val SUPPORTED: Set<String> = setOf(
        "HTTP",
        "HTTPS",
        "FTP"
    )
    val requested = "smtp".uppercase()
    val isSupported = requested in SUPPORTED
    println("Support for $requested: $isSupported")
}