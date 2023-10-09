fun main() {
    val SUPPORTED: Set<String> = setOf(
        "HTTP",
        "HTTPS",
        "FTP"
    )
    val requested = "smtp"
    val isSupported = requested in SUPPORTED
    println("Support for $requested: $isSupported")
}